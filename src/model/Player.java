package model;

import java.util.Objects;

public class Player implements Comparable<Player>{
    String name;
    int currentScore;

    public Player (String name, int currentScore){
        this.name = name;
        this.currentScore = currentScore;
    }
    @Override
    public int compareTo(Player scorePlayer) {      // ordenar o score
        if (this.currentScore > scorePlayer.getCurrentScore()) {
            return -1;
        }
        if (this.currentScore < scorePlayer.getCurrentScore()) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return currentScore == player.currentScore &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, currentScore);
    }



}
