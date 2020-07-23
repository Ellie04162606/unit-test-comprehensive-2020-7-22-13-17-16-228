package example;

import java.util.Arrays;

public class GameProcess {
    public int times;
    public GuessNumber guessNumber;
    public GenerateAnswer generateAnswer;

    public GameProcess() {
        this.generateAnswer = new GenerateAnswer();
    }

    public GameProcess(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String playGame(int times, int[] inputNumber) {
        String result = "";
        if (times > 6) {
            return "The game is over";
        }
        if (Arrays.equals(inputNumber, generateAnswer.generate())) {
            return "The game is over, you are win.";
        }
        return result;
    }
}
