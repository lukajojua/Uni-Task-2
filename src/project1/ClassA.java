package project1;

import java.util.Scanner;

public class ClassA {
    private static final Scanner scanner = new Scanner(System.in);
    private final int a;
    private final int b;

    public ClassA() {
        System.out.println("enter first number");
        this.a = scanner.nextInt();
        System.out.println("enter second number");
        this.b = scanner.nextInt();
    }

    public int sum() {
        return a + b;
    }

    public int multiply() {
        return a * b;
    }
}
