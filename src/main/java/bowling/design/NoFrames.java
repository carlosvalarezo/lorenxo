package bowling.design;

import java.util.ArrayList;
import java.util.List;

import bowling.BowlingFrame;
import bowling.BowlingThrow;
import bowling.Game;
import bowling.Spare;
import bowling.Strike;
import bowling.interfaces.IBowlingThrow;
import bowling.interfaces.IGameState;

public class NoFrames implements IGameState {

	@Override
	public void createFrame(Game game, int numberOfPins) {
		IBowlingThrow bowlingThrow = new BowlingThrow(numberOfPins);
		List<BowlingThrow> listOfThrows = new ArrayList<>();
		listOfThrows.add((BowlingThrow) bowlingThrow);		
		if(numberOfPins == 10){
			if(game.getBowlingFrameList().isEmpty())
				game.getBowlingFrameList().add(new BowlingFrame(1,listOfThrows));			
		}
		else {
			listOfThrows.add((BowlingThrow) bowlingThrow);
		}
		//return new BowlingFrame(1,listOfThrows);
	}
	
	

	@Override
	public void createReward(BowlingFrame bowlingFrame) {
		if(!bowlingFrame.getBowlingThrowList().isEmpty()) {
			if(bowlingFrame.getBowlingThrowList().get(0).getNumberOfPins() == 10)
				bowlingFrame.getBowlingThrowList().get(0).setReward(new Strike(bowlingFrame.getBowlingThrowList().get(0)));
			else if((bowlingFrame.getBowlingThrowList().get(0).getNumberOfPins() + bowlingFrame.getBowlingThrowList().get(1).getNumberOfPins()) == 10){
				bowlingFrame.getBowlingThrowList().get(0).setReward(new Spare(bowlingFrame.getBowlingThrowList().get(0)));				
			}
		}
	}

	@Override
	public void pinsToReward(BowlingFrame bowlingFrame, int numberOfPins) {
		if(bowlingFrame.getBowlingThrowList().get(0).getReward().getClass().equals(Strike.class)) {
			bowlingFrame.getBowlingThrowList().get(0).getReward().
		}

	}

	@Override
	public int calculateScore(BowlingFrame bowlingFrame) {
		// TODO Auto-generated method stub
		return 0;
	}

}
