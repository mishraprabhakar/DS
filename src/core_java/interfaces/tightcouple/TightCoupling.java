package core_java.interfaces.tightcouple;

import core_java.interfaces.Keyboard;

class DellKeyboard implements Keyboard {

     private String info;

    @Override
    public String display() {
        info = "Dell Keyboard";
        return this.info;
    }
}

class LenovoKeyBoard implements Keyboard{

    private String info;

    @Override
    public String display() {
        info = "Lenovo Keyboard";
        return this.info;
    }
}

class Computer{
    //the method only handles keyboard made by the company Dell
    public void display(DellKeyboard dell){
        System.out.println("Computer is using "+dell.display());
    }
}

public class TightCoupling {

    public static void main(String[] args) {
//        Computer computer = new Computer();
//        DellKeyboard dellKeyboard = new DellKeyboard();
//        computer.display(dellKeyboard);



    }
}
