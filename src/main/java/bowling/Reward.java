package bowling;

import bowling.interfaces.IBowlingThrow;

public abstract class Reward implements IBowlingThrow {
    IBowlingThrow bowlingThrow;

    public Reward(IBowlingThrow bowlingThrow){
        this.bowlingThrow = bowlingThrow;
    }



}