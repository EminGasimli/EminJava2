package Lesson34.Task3;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(2300);
        Clothing clothing = new Clothing(5598);
        System.out.println("Elektronika endirimli qiymət: "
                + electronics.getDiscountedPrice());
        System.out.println("Geyim endirimli qiymət: "
                + clothing.getDiscountedPrice());
    }
}
