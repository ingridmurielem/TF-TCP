package service;

import model.Gamester;
import java.util.List;
import java.util.Collections;

public class Ranking  {

    List<Gamester> gamesterScore;
    List<Gamester> ranking;


    public Ranking(List<Gamester> gamesterScore, List<Gamester>ranking){
        this.gamesterScore = gamesterScore;
        this.ranking = ranking;
    }

    public List <Gamester> getRanking() {
        return ranking;
    }

    public void setRanking(List <Gamester> ranking) {
        this.ranking = ranking;
    }

    public List<Gamester> orderScore()  //ordena o ranking
    {
        Collections.sort(gamesterScore);
        return gamesterScore;
    }
    public List<Gamester> cutLowScore(List<Gamester> gamesterScore){   ///Elimina os jogadores que não estão nas dez
                                                                    // primeiras posições da lista após o ordenamento.


    }

    public void clearRanking(List<Gamester>ranking)
    {
        ranking.clear();
    }




}
