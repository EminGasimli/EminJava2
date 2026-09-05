package Lesson33;

public class Praktika {
    public String ad;
    protected int yas;
    String seher;
    private double maas;

    public Praktika(){
    }

    public void setMaas(double maas){
        this.maas = maas;
    }

    public void melumatlariGoster(){
        System.out.println("Ad:" + ad);
        System.out.println("Yas:" + yas);
        System.out.println("Seher:" + seher);
        System.out.println("Maas:" + maas);
    }
}
