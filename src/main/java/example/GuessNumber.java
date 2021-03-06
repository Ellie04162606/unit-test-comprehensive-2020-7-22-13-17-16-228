package example;

import java.util.stream.IntStream;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String guessNumber(int[] inputNumber) {

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
