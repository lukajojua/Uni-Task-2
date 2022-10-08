package TasksUsingConstructors;

public class Task4 {
    public int x;
    public int y;

    public Task4() {
        System.out.println("hello my Class");
    }
    public int withX(){
        if (x>0){
            return 4*x-y;
        }
        return 2*x+y;
    }

    public int withY(){
        if (y>0){
            return 4*x+y;
        }
        return 2*x-y;
    }
}

