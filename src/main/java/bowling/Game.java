package bowling;

import data.Bowler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Game{
    Player player;
    List<Integer> listOfResults;
    int totalScore;
    BowlingFrame frames[] = new BowlingFrame[10];

    public Game(String name, List<Integer> listOfResults){
        this.player = new Player(name);
        this.listOfResults = listOfResults;
        //aqui debo obtener la lista de resultado de cada jugador que viene desde afuera
        //JEff = [10,3,4,1,4,5,4,3,2,1] obtengo la lista y el nombre ya esta obtenido

    }

    public void play(List<Integer> list){
        Map<String, List<Bowler>> result;
        result = list.stream().collect(Collectors.groupingBy(Bowler::getName));
        result.forEach((k, v) -> {
            player.setName(k);
            player.

            System.out.print(k + "=");
            v.forEach(a->System.out.print(a.getPins() + ","));
            System.out.println();
        });

    }

}