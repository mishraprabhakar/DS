package linkedlist;

import java.util.LinkedList;

public class AddTwoNumber {
    public static void sumOfTwoLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList resultList = new LinkedList();
        String num1 = "";
        String num2 = "";

        for (Integer i: list1) {
            num1 += i;
        }
        for (Integer i: list2) {
            num2 += i;
        }

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int result = number1+number2;
        String resultString = String.valueOf(result);

        for (int i = resultString.length()-1; i >=  0; i--){
            resultList.add(resultString.charAt(i));
        }

        System.out.println(resultList);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        LinkedList list1 = new LinkedList<Integer>();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
//        list.add(4);
//        list.add(3);


        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
//        list1.add(6);
//        list1.add(4);
        sumOfTwoLinkedList(list, list1);
    }
}
