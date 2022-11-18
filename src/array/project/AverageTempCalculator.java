package array.project;

import java.util.Scanner;

public class AverageTempCalculator {
    public static void main(String[] args) {
        averageTemperature();
    }

    public static void averageTemperature(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day's : ");
        int noOfDays = sc.nextInt();

        int[] daysTemperature = new int[noOfDays];

        for (int i=0; i<noOfDays; i++){
            System.out.println("Enter day "+(i+1)+" temperature : ");
            daysTemperature[i] = sc.nextInt();
        }

        for (int i=0; i<noOfDays; i++){
            int averagetemp = calcAverageTemp(daysTemperature);
            System.out.println("Average temperature : "+ averagetemp);
            if (daysTemperature[i] > averagetemp)
            {
                System.out.println(i+1+" Day temperature is more than average temperature");
            }
        }
    }

    public static int calcAverageTemp(int[] arr){

        int averageTemp = 0;
        for (int i=0; i<arr.length; i++){
            averageTemp = averageTemp + arr[i];
        }
        return averageTemp/arr.length;
    }
}
