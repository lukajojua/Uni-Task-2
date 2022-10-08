package TasksUsingConstructors;

public class Task2 {
    private int x;


    public Task2() {
    }

    public Task2(int x) {
        this.x = x;
    }

    public boolean Between5And24(){
        return x>5&&x<24;
    }
}

