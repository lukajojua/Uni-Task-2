package project3;

import java.util.Random;
import java.util.Scanner;

public class ClassB {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private int[] arr = new int[12];

    public ClassB() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + (i + 1) + " number");
            arr[i] = scanner.nextInt();
        }
    }

    public void fromRange() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
    }

    public void moreThanSeven() {
        for (int j : arr) {
            if (j > 7) {
                System.out.println(j + " " + "i");
            }
        }
    }

    public int maxMinusMin() {
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        return max - min;
    }
}
