package Lesson40;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void showValue() {
        System.out.println("Dəyər: " + value);
    }
}