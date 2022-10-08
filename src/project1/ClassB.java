package project1;

import java.util.Scanner;

public class ClassB {
    private static final Scanner scanner = new Scanner(System.in);
    private final int a;
    private final int b;
    private final int c;

    public ClassB() {
        System.out.println("enter first number");
        this.a = scanner.nextInt();
        System.out.println("enter second number");
        this.b = scanner.nextInt();
        System.out.println("enter third number");
        this.c = scanner.nextInt();
    }

    public int max() {
        return Math.max(a, Math.max(b, c));
    }

    public int min() {
        return Math.max(a, Math.min(b, c));
    }
}
