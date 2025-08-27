package classwork;

import java.util.Scanner;

public class program1 {
    public static class javalab {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no.1:");
            int a = sc.nextInt();
            System.out.print("Enter no.2:");
            int b = sc.nextInt();
            System.out.print("Enter no.3:");
            int c = sc.nextInt();
            sc.close();
            int greatest;
            if(a>b && a>c){
              greatest = a;
            }
            else if(b>a && b>c){
                greatest = b;
            }
            else{
                greatest = c;
            }
            System.out.println("Greatest no = " +greatest);


        }
    }
}
