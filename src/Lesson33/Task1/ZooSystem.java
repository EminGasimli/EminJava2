package Lesson33.Task1;

public class ZooSystem {
    public static void main(String[] args) {
        Animal lion = new Predator("Şir", 5, "Roar");
        Animal cow = new Herbivore("İnək", 4, "Moo");
        ZooKeeper keeper = new ZooKeeper();
        keeper.feedAnimal(lion);
        keeper.feedAnimal(cow);
    }
}
