package service;

import model.Gamester;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Ranking  {

    List<Gamester> gamesterScore;
    List<Gamester> ranking;



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
    public List<Gamester> cutLowScore(List<Gamester> gamesterScore){
            List <Gamester> ranking = new ArrayList <>();
            ranking = gamesterScore.stream().limit(10).collect(Collectors.toList());
            return ranking;
    }

    public void clearRanking(List<Gamester>ranking)
    {
        ranking.clear();
    }




}
