package TasksUsingPolymorphism.Task2;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.y = 3;
        classA.x = 4;
        classA.getX();
        classA.setXAndY();
        classA.getY();
        ClassB classB = new ClassB(3, 4);
        classB.methodOne();
        classB.methodTwo();
        ClassC classC = new ClassC(2, 3, 4);
        classC.avg();
        classC.avgGeometric();
        classC.max();
    }
}
