package project4;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne=new ClassOne();
        classOne.y=3;
        classOne.x=4;
        classOne.z=-1;
        classOne.methodOne();
        classOne.methodTwo();
        classOne.methodThree();
        ClassTwo classTwo=new ClassTwo(3,4);
        classTwo.difference();
        classTwo.sum();
        ClassThree classThree=new ClassThree(12.0);
        classThree.secondMethod();
        classThree.firstMethod();
        classThree.thirdMethod();

    }
}
