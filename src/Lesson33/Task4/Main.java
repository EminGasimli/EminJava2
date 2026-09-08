package Lesson33.Task4;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Ali", 16);
        SportsClub club = new SportsClub(player);
        club.showPlayer();
        club = null;
        player.showInfo();
    }
}
