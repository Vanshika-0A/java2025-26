package javatutorial;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //writing a program of CBSE Percentage Calculator
        System.out.print("Enter marks in english:");
        int a = sc.nextInt();
        System.out.print("Enter marks of physics:");
        int b = sc.nextInt();
        System.out.print("Enter marks of maths:");
        int c = sc.nextInt();
        System.out.print("Enter marks of chemistry:");
        int d = sc.nextInt();
        System.out.print("Enter marks of P.E:");
        int e = sc.nextInt();
        float total = a+b+c+d+e;
        float x = total/500;
        float percentage = x*100;
        System.out.print("percentage:"+percentage);
    }
}
