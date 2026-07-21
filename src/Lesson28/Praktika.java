package Lesson28;

public class Praktika {
    int yas;
    String ad;

    public Praktika(){
        ad = "a";
        yas = 0;
    }

    public Praktika(String ad, int yas){
        this.ad = ad;
        this.yas = yas;
    }
    void melumatGoster(){
        System.out.println("ad:" + ad);
        System.out.println("yas:" + yas);
    }

     public void main(String[] args) {
        Praktika p = new Praktika();
        Praktika p1 = new Praktika("Emin", 13);
        p.melumatGoster();
        p1.melumatGoster();
    }
}
