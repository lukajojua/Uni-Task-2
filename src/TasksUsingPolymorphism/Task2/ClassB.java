package TasksUsingPolymorphism.Task2;

public class ClassB extends ClassA {
    public ClassB(int x, int y) {
        super.x = x;
        super.y = y;
    }

    public int methodOne() {
        return y - x;
    }

    public int methodTwo() {
        return x + 2 * y;
    }
}
