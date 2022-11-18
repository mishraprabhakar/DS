package core_java.overriding;

public class AccessingSuperClassMethodsAndVarWithSuper {

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.i);
        obj.show();
    }

}

class A{

    int i = 10;
    public void show( ){
        System.out.println("This is class A method ");
    }


}
class B extends A{
    public void show(){
        super.i = 30;
        super.show();
        System.out.println("This is class B method");

    }
}
