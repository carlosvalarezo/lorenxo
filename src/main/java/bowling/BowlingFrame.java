package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingFrame{
    int number;
    int score;
    List<BowlingThrow> bowlingThrowList;

    public BowlingFrame(){
        number = 0;
        score = 0;
        bowlingThrowList = new ArrayList<>();
    }
}