package example;

import java.util.HashSet;
import java.util.stream.IntStream;

public class GuessNumber {
    int[] answer = {1, 2, 3, 4};

    public String guessNumber(int[] inputNumber) {
        int a = 0;
        int b = 0;
        if (inputNumber.length != 4) {
            return "Wrong Input,Input again";
        }
        if (!hasNoRepeat(inputNumber)) {
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

    public static boolean hasNoRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size() == array.length;
    }
}
