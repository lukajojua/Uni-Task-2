package TasksUsingPolymorphism.Task2;

public class ClassC extends ClassB {
    public int z;

    public ClassC(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int avg() {
        return (x + y + z) / 3;
    }

    public double avgGeometric() {
        return Math.cbrt(x * y * z);
    }

    public int max() {
        return Math.min(x, Math.min(y, z));
    }
}
