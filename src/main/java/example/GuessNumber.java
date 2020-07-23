package example;

import java.util.Arrays;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        String result = "";
        if (isCorrectAnswer(inputNumber)) {
            return "4A0B";
        }
        return result;
    }

    public boolean isCorrectAnswer(int[] inputNumber) {
        return Arrays.equals(inputNumber, answer);
    }
}
