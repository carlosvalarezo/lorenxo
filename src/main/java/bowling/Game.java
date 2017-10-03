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
    List<BowlingFrame> bowlingFrame = new ArrayList<>();

    public Game(String name, List<Integer> listOfResults){
        this.player = new Player(name);
        this.listOfResults = listOfResults;
        //aqui debo obtener la lista de resultado de cada jugador que viene desde afuera
        //Jeff = [10,3,4,1,4,5,4,3,2,1] obtengo la lista y el nombre ya esta obtenido

    }

    public void play(){
    	//bowlingFrame = this.listOfResults.stream()
    	//this.listOfResults.stream().forEach();
        System.out.println(this.player.getName());
        this.listOfResults.stream().forEach(i -> System.out.print("|" + i + "|"));
        System.out.println();
    }

}
