package TasksUsingPolymorphism.Task1;

import java.util.Scanner;

public class ClassA{
    protected final static Scanner scanner=new Scanner(System.in);
    public int x;

    public ClassA() {
        System.out.println("hello my class");
    }

    public void setX() {
        x=scanner.nextInt();

    }

    public int getX() {
        return x;
    }

    public String oddOrEven(){
        if (x%2==0){
            return "even";
        }
        return "odd";
    }
}
