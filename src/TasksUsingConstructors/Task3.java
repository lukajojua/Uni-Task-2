package TasksUsingConstructors;

public class Task3 {
    private int a;
    private int b;
    public int x;

    public Task3() {
    }

    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isRange() {
        return a < b;
    }

    public boolean isInRange() {
        if (isRange()) {
            return a < x && b > x;
        }
        return false;
    }
}
