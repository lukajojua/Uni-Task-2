package TasksUsingPolymorphism.Task1;

public class ClassB extends ClassA{
    public int y;

    public void setY() {
        this.y = scanner.nextInt();
    }
    public  int sum(){
        return y+x;
    }
}
