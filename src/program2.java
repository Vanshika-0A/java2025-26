public class program2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                count++;
                sum += i;
            }
        }


        System.out.println("Total odd numbers between 1 to 100: " + count);
        System.out.println("Sum of odd numbers between 1 to 100: " + sum);
    }
}

