package example;

import java.util.HashSet;

public class CheckLegal {
    public boolean isLegalInput(int[] inputNumber) {
        if (inputNumber.length != 4) {
            return false;
        }
        if (!hasNoRepeat(inputNumber)) {
            return false;
        }
        return !hasNumberOutOfRange(inputNumber);
    }

    private boolean hasNumberOutOfRange(int[] inputNumber) {
        for (int number : inputNumber) {
            if (number < 0 || number > 9)
                return true;
        }
        return false;
    }

    public static boolean hasNoRepeat(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : array) {
            hashSet.add(value);
        }
        return hashSet.size() == array.length;
    }
}
