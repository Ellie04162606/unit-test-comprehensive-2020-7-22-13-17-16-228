package example;

import java.util.HashSet;
import java.util.stream.IntStream;

public class GuessNumber {
    //    int[] answer = {1, 2, 3, 4};
    GenerateAnswer generateAnswer;

    public GuessNumber(GenerateAnswer generateAnswer) {
        this.generateAnswer = generateAnswer;
    }

    public String guessNumber(int[] inputNumber) {
        int[] answer = generateAnswer.generate();
        int a = 0;
        int b = 0;
        if (!hasNoRepeat(inputNumber)) {
            return "Wrong Input,Input again";
        }
        if (hasNumberOutOfRange(inputNumber)) {
            return "Wrong Input,Input again";
        }
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

    private boolean hasNumberOutOfRange(int[] inputNumber) {
        for (int number : inputNumber) {
            return number < 0 || number > 9;
        }
        return false;
    }

    public static boolean hasNoRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size() == array.length;
    }
}
