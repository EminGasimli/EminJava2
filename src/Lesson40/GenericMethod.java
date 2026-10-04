package Lesson40;

public class GenericMethod {
    public static <T> void show(T value) {
        System.out.println("Dəyər: " + value);
    }

    public static void main(String[] args) {
        GenericClass<String> stringObject =
                new GenericClass<>("Java");
        GenericClass<Integer> integerObject =
                new GenericClass<>(100);

        stringObject.showValue();
        integerObject.showValue();

        show("Salam");
        show(25);
        show(15.5);
    }
}