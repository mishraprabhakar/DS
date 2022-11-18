package core_java.custom_immutable_class;

public final class CustomImmutableButNewObjectCreatedWithEveryChange {

    private int i;

    public CustomImmutableButNewObjectCreatedWithEveryChange(int i) {
        this.i = i;
    }

    public CustomImmutableButNewObjectCreatedWithEveryChange modifyClass(int i){

        if (this.i == i){
            return this;
        }else{
            return new CustomImmutableButNewObjectCreatedWithEveryChange(i);
        }

    }

    public static void main(String[] args) {
        CustomImmutableButNewObjectCreatedWithEveryChange immutable = new CustomImmutableButNewObjectCreatedWithEveryChange(20);
        var immutable1 = immutable.modifyClass(30);
        var immutable2 = immutable.modifyClass(20);

        System.out.println(immutable == immutable1);
        System.out.println(immutable == immutable2);
    }
}
