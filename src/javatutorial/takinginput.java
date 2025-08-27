package javatutorial;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
//        System.out.println("Taking input from user");
       Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter no2: ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("sum of two integers: " +sum);
//       now how to take word and whole line
//        System.out.print("enter a name: ");
//        String word = sc.next();
//        System.out.println(word);
        System.out.println("Type a sentence: ");
        String str = sc.nextLine();
        System.out.println(str);

    }
}
