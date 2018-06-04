package service;

import model.Player;
import java.util.List;
import java.util.Collections;

public class Ranking  {

    List<Player> playerScore;
    List<Player> ranking;


    public Ranking(List<Player> playerScore, List<Player>ranking){
        this.playerScore = playerScore;
        this.ranking = ranking;
    }

    public List <Player> getRanking() {
        return ranking;
    }

    public List <Player> getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(List <Player> playerScore) {
        this.playerScore = playerScore;
    }

    public void setRanking(List <Player> ranking) {
        this.ranking = ranking;
    }

    public List<Player> orderScore()
    {
        Collections.sort(playerScore);
        return playerScore;
    }

    public void clearRanking()
    {
        
    }




}
