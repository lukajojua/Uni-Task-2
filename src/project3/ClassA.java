package project3;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private int[] arr = new int[10];

    public ClassA() {
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

    public int lessThanIndex() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < i) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public int moreThanIndex() {
        boolean found = false;
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                found = true;
                res *= arr[i];
            }
        }
        if (!found) {
            res = 0;
        }
        return res;
    }
}
