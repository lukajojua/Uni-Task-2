package TasksUsingPolymorphism.Task2;

import java.util.Scanner;

public class ClassA {
    protected Scanner scanner = new Scanner(System.in);
    public int x;
    public int y;

    public void setXAndY() {
        x = scanner.nextInt();
        y = scanner.nextInt();

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
