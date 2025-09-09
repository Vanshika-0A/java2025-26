package javatutorial;
import java.util.Scanner;

public class vd12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a:");
//        int a = sc.nextInt();
//        System.out.println(a>8)
        System.out.print("u:");
float u = sc.nextInt();
        System.out.print("v:");
float v = sc.nextInt();
        System.out.println("a:");
float a = sc.nextInt();
int s = 8;
float formula = (v*v-u*u)/(2*a*s);

        System.out.println(formula);
    }
}
