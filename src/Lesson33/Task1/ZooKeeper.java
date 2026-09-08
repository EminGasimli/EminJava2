package Lesson33.Task1;

public class ZooKeeper {
    public void feedAnimal(Animal animal) {
        System.out.println("Baxıcı heyvanı yemləyir:");
        animal.makeSound();
        if (animal instanceof Feedable) {
            Feedable feedable = (Feedable) animal;
            feedable.feed();
        }
        System.out.println();
    }
}