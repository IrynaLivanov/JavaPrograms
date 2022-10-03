package class06;
import java.util.Scanner;

public class homeW06_1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the whole number:");
         int num = sc.nextInt();
         int square = num * num;

         System.out.println("Square of " + num + " is " + square);
    }
}
