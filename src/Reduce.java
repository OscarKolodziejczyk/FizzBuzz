public class Reduce {
    public static void main(String[] args) {
        int amt = reduce(10);
        System.out.println(amt);
    }

    public static int reduce(int x) {
        int steps = 0;
        while (x > 0) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x - 1;
            }
            steps++;
        }
        return steps;
    }
}
