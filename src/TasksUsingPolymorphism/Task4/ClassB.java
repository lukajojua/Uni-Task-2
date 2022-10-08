package TasksUsingPolymorphism.Task4;

public class ClassB extends ClassA{
    double x;
    double y;

    public void setXandSetY(){
        x=scanner.nextInt();
        y=scanner.nextInt();
    }

    public void  change(){
        var temp=b;
        if (a>b){
            b=a;
            temp=b;
        }
    }

    public void setX(){
        change();
        x =  (Math.random() * (b - a)) + a;
    }

}
