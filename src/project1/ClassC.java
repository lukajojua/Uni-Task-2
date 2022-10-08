package project1;

import java.util.Scanner;

public class ClassC {
    private static final Scanner scanner = new Scanner(System.in);
    private final int a;
    private final int b;
    private final int c;

    public ClassC() {
        System.out.println("enter first number");
        this.a = scanner.nextInt();
        System.out.println("enter second number");
        this.b = scanner.nextInt();
        System.out.println("enter third number");
        this.c = scanner.nextInt();
    }

    public int lastDigitOfA() {

        return a % 10;
    }

    public int firstDigitOfB() {

        return Integer.parseInt(Integer.toString(b).substring(0, 1));
    }

    public int sumOfDigitsC() {
        int value = c;

        int sum = 0;
        while (value > 9) {
            sum += value % 10;
            value /= 10;
        }
        sum += value;

        return sum;
    }

    public int lastAndFirst() {

        return lastDigitOfA() * firstDigitOfB();
    }

    public int lastAndFirstAndSum() {
        return lastAndFirst() + sumOfDigitsC();

    }

}
