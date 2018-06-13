package model;

import java.util.Objects;

public class Gamester implements Comparable<Gamester>{
    String name;
    int currentScore;

    public Gamester(String name, int currentScore){
        this.name = name;
        this.currentScore = currentScore;
    }
    @Override
    public int compareTo(Gamester scoreGamester) {      // ordenar o score
        if (this.currentScore > scoreGamester.getCurrentScore()) {
            return -1;
        }
        if (this.currentScore < scoreGamester.getCurrentScore()) {
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
        Gamester gamester = (Gamester) o;
        return currentScore == gamester.currentScore &&
                Objects.equals(name, gamester.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, currentScore);
    }



}
