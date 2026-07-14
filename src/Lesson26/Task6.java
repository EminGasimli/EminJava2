package Lesson26;

public class Task6 {
    static void hesabla(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0)
                    System.out.println("Sıfıra bölmək olmaz!");
                else
                    System.out.println((double) a / b);
                break;
            default:
                System.out.println("Yanlış operator");
        }
    }

    public static void main(String[] args) {
        hesabla(10, 5, '+');
        hesabla(10, 5, '-');
        hesabla(10, 5, '*');
        hesabla(10, 5, '/');
        hesabla(10, 0, '/');
    }
}
