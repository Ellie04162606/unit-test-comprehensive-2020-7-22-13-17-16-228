package example;

import java.util.stream.IntStream;

public class GuessNumber {
    GenerateAnswer generateAnswer;

    public GuessNumber(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
    }

    public String guessNumber(int[] inputNumber) {
        int[] answer = generateAnswer.generate();
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
