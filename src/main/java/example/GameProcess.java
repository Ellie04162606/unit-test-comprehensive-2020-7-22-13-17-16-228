package example;

import java.util.Arrays;

public class GameProcess {
    public static final String THE_GAME_IS_OVER = "The game is over";
    public static final String WRONG_INPUT = "Wrong Input,Input again";
    public static final String THE_GAME_IS_OVER_YOU_ARE_WIN = "The game is over, you are win.";
    private int remainingTimes = 0;
    private final GuessNumber guessNumber;
    private final CheckLegal checkLegal;
    private final int[] answer;

    public GameProcess(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generate();
        this.guessNumber = new GuessNumber(answer);
        this.checkLegal = new CheckLegal();
    }

    public String playGame(int[] inputNumber) {
        String result = "";
        this.remainingTimes++;
        if (remainingTimes > 6) {
            return THE_GAME_IS_OVER;
        }
        if (!checkLegal.isLegalInput(inputNumber)) {
            return WRONG_INPUT;
        }
        result = guessNumber.guessNumber(inputNumber);

        if ("4A0B".equalsIgnoreCase(result)) {
            return THE_GAME_IS_OVER_YOU_ARE_WIN;
        } else if (remainingTimes == 6) {
            return THE_GAME_IS_OVER;
        }
        return result;
    }
}
