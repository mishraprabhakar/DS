package core_java.custom_immutable_class;


class Engine{
    Integer id;

    public Engine(Integer id) {
        this.id = id;
    }
}

public final class CustomImmutableClass {

   private final Integer id;
   private final String name;

   private final Engine engine;


    public CustomImmutableClass(Integer id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        Engine engine1 = new Engine(engine.id);
        this.engine = engine1;      //Here is deep copy of object so value will not change
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Engine engine = new Engine(20);
        CustomImmutableClass immutableClass = new CustomImmutableClass(1, "Prabhakar",engine);
        System.out.println(immutableClass.name == "Prabhakar");
        System.out.println(immutableClass.id);

        System.out.println("Engine Id "+immutableClass.engine.id);
        engine.id = 50;
        System.out.println("Engine Id "+immutableClass.engine.id);         //Engine Id get changed if there is shallow copy of object
    }


}
