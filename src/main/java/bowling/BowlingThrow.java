package bowling;

import bowling.interfaces.IBowlingThrow;

public class BowlingThrow{
    private int numberOfPins;
    private IBowlingThrow reward;

    public int getNumberOfPins() {
        return numberOfPins;
    }

    public void setNumberOfPins(int numberOfPins) {
        this.numberOfPins = numberOfPins;
    }

    public IBowlingThrow getReward() {
        return reward;
    }

    public void setReward(IBowlingThrow reward) {
        this.reward = reward;
    }
}