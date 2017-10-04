package bowling.interfaces;

import bowling.BowlingFrame;
import bowling.Game;

public interface IGameState {
	
	public void createFrame(Game game, int numberOfPins);
	public void createReward(BowlingFrame bowlingFrame);
	public void pinsToReward(BowlingFrame bowlingFrame, int numberOfPins);
	
	public int calculateScore(BowlingFrame bowlingFrame);
	 
	

}
