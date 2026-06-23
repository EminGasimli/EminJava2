package Lesson20;
import java.util.Scanner;

public class Praktika {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int uzunluq = String.valueOf(n).length();
        int cem = 0;
        for(int i = 0; i < uzunluq; i++){
            if((n%10) % 2 == 0){
                cem += n%10;
            }
            n /= 10;
        }
        System.out.println(cem);
    }
}
