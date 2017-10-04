package bowling;

import bowling.design.LastFrame;
import bowling.design.NoFrames;
import bowling.design.NormalFrame;
import bowling.interfaces.IBowlingThrow;
import bowling.interfaces.IGameState;
import data.Bowler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Game implements IGameState{
    Player player;
    List<Integer> listOfResults;
	int totalScore;
    List<BowlingFrame> bowlingFrameList = new ArrayList<>();//it is the scoreborad of 10 frames
    //hay que analizar el estado de la lista. La lista tiene los tres estados.
    //aqui habra la lista de posible estados para un juego: NoFrames, NormalFrame, LastFrame
    //aqui va el state del game
    IGameState noFrames = new NoFrames();
    IGameState normalFrame = new NormalFrame();
    IGameState lastFrame = new LastFrame();
    
    IGameState state = noFrames;
    int cntFrames = 0;
    
    
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
        //bowlingFrame = this.listOfResults.stream().forEach(i -> new BowlingFrame(listOfResults.indexOf(i)+1, ); System.out.print("|" + i + "|"));
        

        this.listOfResults.stream().map(i -> {
            IBowlingThrow bowlingThrow = new BowlingThrow(i);//esto si hay siempre
            List<BowlingThrow> listOfThrows;
            BowlingFrame bowlingFrame;
            
            


        });
        //aqui hacerle addAll
        System.out.println();
    }

	@Override
	public BowlingFrame createFrame(Game game, int numberOfPins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BowlingFrame createReward(BowlingFrame bowlingFrame) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BowlingFrame pinsToReward(BowlingFrame bowlingFrame, int numberOfPins) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public int calculateScore(BowlingFrame bowlingFrame) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<BowlingFrame> getBowlingFrameList() {
		return bowlingFrameList;
	}

	public void setBowlingFrameList(List<BowlingFrame> bowlingFrameList) {
		this.bowlingFrameList = bowlingFrameList;
	}

}
