package example;

import java.util.Arrays;

public class GameProcess {
    public static final String THE_GAME_IS_OVER = "The game is over";
    public static final String WRONG_INPUT = "Wrong Input,Input again";
    public static final String THE_GAME_IS_OVER_YOU_ARE_WIN = "The game is over, you are win.";
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
            return THE_GAME_IS_OVER;
        }
        if (!checkLegal.isLegalInput(inputNumber)) {
            return WRONG_INPUT;
        }
        result = guessNumber.guessNumber(inputNumber);
        if (Arrays.equals(inputNumber, generateAnswer.generate())) {
            return THE_GAME_IS_OVER_YOU_ARE_WIN;
        }
        return result;
    }
}
