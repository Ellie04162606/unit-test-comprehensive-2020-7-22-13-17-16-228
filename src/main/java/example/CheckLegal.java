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
        if (hasNumberOutOfRange(inputNumber)) {
            return false;
        }
        return true;
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
