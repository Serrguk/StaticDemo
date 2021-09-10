package staticdemo;

import java.util.Arrays;

public class MyClass {
    private int count = 1;
    private final int arrayValue;
    private final int arrayCount;
    private final int[] array;

    public MyClass(int arrayValue, int arrayCount) {
        this.arrayValue = arrayValue;
        this.arrayCount = arrayCount;
        array = new int[arrayValue];
    }

    public void calculate() {
        while (array[arrayValue - 1] < arrayCount) {
            array[0] = count;
            count++;
            for (int i = 1; i < array.length; i++) {
                if (subArray()) {
                    array[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private boolean subArray() {
        boolean check = true;
        for (int anInt : array) {
            if (anInt % arrayCount != 0 || anInt == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
