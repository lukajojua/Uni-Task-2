package TasksUsingConstructors;

public class Main {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.x=4;
        task1.evenOrOdd();
        Task2 task2=new Task2();
        task2=new Task2(3);
        task2.Between5And24();
        Task3 task3=new Task3();
        task3=new Task3(2,4);
        task3.isRange();
        task3.x=40;
        task3.isInRange();
        Task4 task4=new Task4();
        task4.y=3;
        task4.x=6;
        task4.withX();
        task4.withY();
        Task5 task5=new Task5();
        task5=new Task5(1.2f);
        task5.x=4;
        task5.y=6;
        task5.xIsPositive();
        task5.min();
        Task6 task6=new Task6();
        task6=new Task6(1.2f);
        task6=new Task6(1.2f,1.5f);
        task6.gcd();
        task6.lcm();
    }
}
