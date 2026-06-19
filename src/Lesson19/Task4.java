package Lesson19;

public class Task4 {
    static void main() {
        StringBuilder sb = new StringBuilder("Mən");
        sb.append(" Java");
        sb.insert(8, " öyrənirəm");
        sb.append("!");
        System.out.println("StringBuilder nəticəsi:");
        System.out.println(sb);
        StringBuffer sf = new StringBuffer("Salam Java");
        sf.replace(6, 10, "dünya");
        System.out.println("\nStringBuffer nəticəsi:");
        System.out.println(sf);
    }
}
