package Lesson39;

public class Praktika {
    static void main() {
        int[] ededler = {10,20,30};
        int bolen = 0;
        try {
            System.out.println("Massivin elementi:" + ededler[2]);
            int netice = ededler[1]/bolen;
            System.out.println("Netice:" + netice);
        }
        catch (ArithmeticException e){
            System.out.println("Xeta: Sifira bolmek olmaz (" + e.getMessage() + ")");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xeta: massivde bele bir indeks yoxdur (" + e.getMessage() + ")");
        }
        catch (Exception e){
            System.out.println("Umumi xeta bas verdi:" + e.getMessage());
        }
        finally {
            System.out.println("Emeliyyat basa catdi");
        }
    }
}
