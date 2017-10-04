package bowling.design;

import bowling.BowlingFrame;
import bowling.Game;
import bowling.interfaces.IGameState;

public class NormalFrame implements IGameState {

	@Override
	public BowlingFrame createFrame(Game game, int numberOfPins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createReward(BowlingFrame bowlingFrame) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pinsToReward(BowlingFrame bowlingFrame, int numberOfPins) {
		// TODO Auto-generated method stub

	}

	@Override
	public int calculateScore(BowlingFrame bowlingFrame) {
		// TODO Auto-generated method stub
		return 0;
	}

}
