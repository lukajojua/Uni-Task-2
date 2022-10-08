package TasksUsingConstructors;

public class Task6 {
    public float x;
    public float y;

    public Task6() {
    }

    public Task6(float x) {
        this.x = x;
    }

    public Task6(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public int gcd(){
        int res=1;
        int minimal = (int) Math.min(x, y);
        int maximal =  (int) Math.max(x, y);
        for (int i = 1; i <= minimal; i++) {
            if (minimal % i == 0 && maximal % i == 0) {
                res = i;

            }
        }
        return res;
    }

    public int lcm(){
        int minimal = (int) Math.min(x, y);
        int maximal =  (int) Math.max(x, y);
        return ((maximal*minimal)/gcd());
    }
}
