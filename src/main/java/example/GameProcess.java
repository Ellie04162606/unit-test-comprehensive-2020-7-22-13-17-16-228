package example;

import java.util.Arrays;

public class GameProcess {
    public int remainingTimes = 0;
    public GuessNumber guessNumber;
    public GenerateAnswer generateAnswer;
    public CheckLegal checkLegal;

    public GameProcess(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
        this.guessNumber = new GuessNumber(generateAnswer);
        this.checkLegal = new CheckLegal();
    }

    public String playGame(int[] inputNumber) {
        this.remainingTimes++;
        String result = "";
        if (remainingTimes > 6) {
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
