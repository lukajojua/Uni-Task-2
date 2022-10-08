package TasksUsingPolymorphism.Task3;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    protected Random random=new Random();
    protected Scanner scanner=new Scanner(System.in);
    public int x;
    public int y;

    public void setYAndX() {
       x=scanner.nextInt();
       y=scanner.nextInt();

    }

    public void setXAndYWithRandom() {
        x = (int) (Math.random() * (78 - 12)) + 12;
        y=(int) (Math.random() * (78 - 12)) + 12;
    }

    public void getY() {
        System.out.println(y);;
    }
}
