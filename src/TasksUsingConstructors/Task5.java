package TasksUsingConstructors;

public class Task5 {
    public float x;
    public float y;

    public Task5() {
    }

    public Task5(float x) {
        this.x = x;
    }

    public boolean xIsPositive(){
        return x>0;
    }

    public float min(){
        return Math.min(x,y);
    }
}
