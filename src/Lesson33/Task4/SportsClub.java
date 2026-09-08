package Lesson33.Task4;

public class SportsClub {
    Player player;

    public SportsClub(Player player) {
        this.player = player;
    }

    public void showPlayer() {
        player.showInfo();
    }
}
