package TasksUsingPolymorphism.Task3;

public class ClassB extends ClassA{

    public int returnValue(){
        return x-y;
    }
    public int ReturnValue2(){
        return x+y;

    }
    public void getX(){
        System.out.println(x);
    }
}
