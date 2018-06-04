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

    public void setRanking(List <Player> ranking) {
        this.ranking = ranking;
    }

    public List<Player> orderScore()  //ordena o ranking
    {
        Collections.sort(playerScore);
        return playerScore;
    }
    public List<Player> cutLowScore(List<Player> playerScore){   ///Elimina os jogadores que não estão nas dez
                                                                    // primeiras posições da lista após o ordenamento.


    }

    public void clearRanking(List<Player>ranking)
    {
        ranking.clear();
    }




}
