package example;

import java.util.Arrays;

public class GameProcess {
    public int remainingTimes = 0;
    public GuessNumber guessNumber;
    public GenerateAnswer generateAnswer;
    public CheckLegal checkLegal;

    public GameProcess() {
        this.generateAnswer = new GenerateAnswer();
        this.guessNumber = new GuessNumber(generateAnswer);
    }

    public GameProcess(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
        this.guessNumber = new GuessNumber(generateAnswer);
        this.checkLegal = new CheckLegal();
    }

    public int getRemainingTimes() {
        return remainingTimes;
    }

    public void setRemainingTimes(int remainingTimes) {
        this.remainingTimes = remainingTimes;
    }

    public String playGame(int times, int[] inputNumber) {
        times++;
        String result = "";
        if (times > 6) {
            return "The game is over";
        }
        if (!checkLegal.isLegalInput(inputNumber)) {
            return "Wrong Input,Input again";
        }
        result = guessNumber.guessNumber(inputNumber);
        if (Arrays.equals(inputNumber, generateAnswer.generate())) {
            return "The game is over, you are win.";
        }
        return result;
    }
}
