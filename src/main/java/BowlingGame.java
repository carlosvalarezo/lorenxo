import bowling.Game;
import data.Bowler;
import data.DataSourceFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BowlingGame{
    public static void main(String a[]){
        DataSourceFile dataSourceFile = new DataSourceFile();
        dataSourceFile.readData(a[0].toString());

        List<Bowler> list = new ArrayList<>();
        Map<String, List<Bowler>> result;
        result = list.stream().collect(Collectors.groupingBy(Bowler::getName));
        result.forEach((k, v) -> {
            new Game(k, new ArrayList());


            System.out.print(k + "=");
            v.forEach(a->System.out.print(a.getPins() + ","));
            System.out.println();
        });


        Game game = new Game();
        game.play(result.readData(a[0].toString()));

    }
}