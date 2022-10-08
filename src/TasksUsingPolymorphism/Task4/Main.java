package TasksUsingPolymorphism.Task4;

public class Main {
    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.b=4;
        classA.a=6;
        classA.setAAndB();
        classA.print();
        classA.SetAAndBRandom();
        ClassB classB=new ClassB();
        classB.x=10;
        classB.y=14;
        classB.change();
        classB.setXandSetY();
        classB.setX();
    }
}
