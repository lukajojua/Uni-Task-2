package TasksUsingPolymorphism.Task4;

import java.util.Random;
import java.util.Scanner;

public class ClassA {
    protected  Scanner scanner=new Scanner(System.in);
    protected Random random=new Random();
    public double a;
    public double b;

    public void setAAndB() {
        a=scanner.nextInt();
        b=scanner.nextInt();

    }
    public void SetAAndBRandom(){
        a=random.nextInt(12);
        b=random.nextInt(12);
    }

    public void print(){
        System.out.println(a+" "+b);
    }


}
