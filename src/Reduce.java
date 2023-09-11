public class Reduce {
    public static void main(String[] args) {

    }

    public static int reduce(int x) {
        int steps = 0;
        if (x == 0){
            return steps
        }
        else if (x % 2 == 0) {
            x = x / 2;
        }
        else {
            x - 1;
        }
        steps++;
        x = reduce(x);
    }
}
