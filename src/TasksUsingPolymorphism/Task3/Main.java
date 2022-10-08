package TasksUsingPolymorphism.Task3;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.x=4;
        classA.y=5;
        classA.getY();
        classA.setXAndYWithRandom();
        ClassB classB=new ClassB();
        classB.setXAndYWithRandom();
        classB.returnValue();
        classB.ReturnValue2();
        classB.getX();
        ClassC classC=new ClassC();
        classC.z=4;
        classC.r=6;
        classC.method1();
        classC.getMax();
        classC.ReturnValue2();

    }
}
