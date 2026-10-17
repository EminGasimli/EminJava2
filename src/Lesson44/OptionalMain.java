package Lesson44;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        String product = "Laptop";

        Optional<String> optionalProduct = Optional.ofNullable(product);

        optionalProduct.ifPresentOrElse(System.out::println, () -> System.out.println("Məhsul tapılmadı"));

        String phone = "";

        Optional<String> optionalPhone = Optional.ofNullable(phone).filter(number -> !number.isEmpty());

        System.out.println(optionalPhone.orElse("Nömrə daxil edilməyib"));

        Integer age = null;

        Optional<Integer> optionalAge = Optional.ofNullable(age);

        System.out.println(optionalAge.orElse(18));
    }
}