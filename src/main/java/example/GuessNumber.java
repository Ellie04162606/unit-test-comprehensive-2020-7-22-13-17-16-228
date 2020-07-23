package example;

import java.util.Arrays;

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
        return result;
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
            } else if (Arrays.asList(answer).contains(inputNumber[index])) {
                b++;
            }
        }
        return a == 0 && b == 0;
    }
}
