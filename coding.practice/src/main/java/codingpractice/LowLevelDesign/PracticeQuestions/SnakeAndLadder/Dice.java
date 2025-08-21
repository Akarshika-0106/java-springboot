package codingpractice.LowLevelDesign.PracticeQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int low = 1;
    public int high = 6;

    public int diceCount;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int sum = 0;
        int diceUsed = 0;
        while(diceUsed < diceCount){
            sum += ThreadLocalRandom.current().nextInt(low, high+1);
            diceCount--;
        }
        return sum;
    }
}
