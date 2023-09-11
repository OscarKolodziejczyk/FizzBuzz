public class Multiples {
    public static void main(String[] args) {
        int c = FindMultiples(1000);
        System.out.println(c);
    }

    public static int FindMultiples(int x) {
        int count = 0;
        int i = 1;
        while(i < x){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                count++;
                count++;
            }
            else if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        return count;
    }
}
