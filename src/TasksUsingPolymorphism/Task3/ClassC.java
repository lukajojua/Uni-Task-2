package TasksUsingPolymorphism.Task3;

public class ClassC extends ClassB{
    public  int r;
    public int z;

    public int getMax(){
        return Math.max(x,Math.max(y,Math.max(r,z)));
    }

    public int method1(){
        return z+r+-x+y;
    }

    @Override
    public int ReturnValue2() {
        return super.ReturnValue2()+z+r;
    }
}
