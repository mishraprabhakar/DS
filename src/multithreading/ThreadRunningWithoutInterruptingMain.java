package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadRunningWithoutInterruptingMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future = SeparateTread.separateThread();

        if (future.isDone()){
            System.out.println("Successfully executed");
        }else{
            System.out.println("Still in progress");
        }


        for (int i =0; i<10; i++){
            System.out.println("Main thread is running without interruption "+Thread.currentThread().getName());
            Thread.sleep(1000);
        }

    }


}

class SeparateTread {

    public static CompletableFuture<Void> separateThread() throws ExecutionException, InterruptedException {

        Executor executor = Executors.newCachedThreadPool();

        CompletableFuture<Void> future = CompletableFuture.runAsync(

                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Order Enrich !!"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                },executor
        ).thenApplyAsync( order ->
                {
                    System.out.println("Order Placed !!"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return order;
                },executor
        ).thenApplyAsync( payment ->{
            System.out.println("Payment processed "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return payment;
                },executor

        ).thenAcceptAsync(email ->{

                    System.out.println("Email send successfully"+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                },executor

                );

        return future;
    }

}
