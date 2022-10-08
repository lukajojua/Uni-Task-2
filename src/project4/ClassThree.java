package project4;

public class ClassThree {
    private final double  a;

    public ClassThree(double a) {
        this.a = a;
    }

    public double firstMethod(){
        return a;
    }

    public double secondMethod(){
        return firstMethod();
    }

    public double thirdMethod(){
        return secondMethod();
    }
}
