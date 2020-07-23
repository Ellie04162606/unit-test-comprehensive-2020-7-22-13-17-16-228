package example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        String result = "";
        if (isCorrectAnswer(inputNumber)) {
            return "4A0B";
        }
        if (isCompletelyMisMatchAnswer(inputNumber)) {
            return "0A0B";
        }
        return isAllNumberCorrectWithCompletelyMisMatchPlace(inputNumber);
    }

    public boolean isCorrectAnswer(int[] inputNumber) {
        return Arrays.equals(inputNumber, answer);
    }

    public boolean isCompletelyMisMatchAnswer(int[] inputNumber) {
        int a = 0;
        int b = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] == answer[index]) {
                a++;
            } else {
                int finalIndex = index;
                if (IntStream.of(answer).anyMatch(x -> x == inputNumber[finalIndex])) {
                    b++;
                }
            }
        }
        return a == 0 && b == 0;
    }

    public String isAllNumberCorrectWithCompletelyMisMatchPlace(int[] inputNumber) {
        int a = 0;
        int b = 0;
        for (int index = 0; index < inputNumber.length; index++) {
            if (inputNumber[index] == answer[index]) {
                a++;
            } else {
                int finalIndex = index;
                if (IntStream.of(answer).anyMatch(x -> x == inputNumber[finalIndex])) {
                    b++;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
