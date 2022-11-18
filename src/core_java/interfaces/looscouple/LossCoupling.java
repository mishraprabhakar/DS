package core_java.interfaces.looscouple;

import core_java.interfaces.Keyboard;

public class LossCoupling {

    public static void main(String[] args) {
        Computer computer = new Computer();

        //Now you can run your computer with any keyboard that you want

        //case : 1 I want to run my Computer with Dell Laptop
        DellKeyboard dell = new DellKeyboard();
        computer.display(dell);

        //case : 2 Now I want to run my computer with Lenovo Keyboard
        LenovoKeyBoard lenovoKeyBoard = new LenovoKeyBoard();
        computer.display(lenovoKeyBoard);



    }


}

class DellKeyboard implements Keyboard{

    private String info;

    @Override
    public String display() {
        info = "Dell Keyboard";
        return this.info;
    }
}

class LenovoKeyBoard implements Keyboard {

    private String info;

    @Override
    public String display() {
        info = "Lenovo Keyboard";
        return this.info;
    }
}

class Computer {
    //the method only handles keyboard made by the company Dell
    public void display(Keyboard keyboard){
        System.out.println("Computer is using "+keyboard.display());
    }
    
}



