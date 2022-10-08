package TasksUsingConstructors;

public class Task1 {
    public  int x;

    public Task1() {
        System.out.println("hello world");
    }

    public String evenOrOdd(){
        if(x%2==0){
            return "even";
        }
        return "odd";
    }

}
