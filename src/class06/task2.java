package class06;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = sc.nextInt();

        int month = age * 12;
        int days = age * 365;
        long minutes = age * 525600;


        System.out.println("You have spent " + " " + month + " " + "month on the year");
        System.out.println("You have spent " + " " + days + " " + "days on the year");
        System.out.println("You have spent " + " " + minutes + " " + "minutes on the year");
    }
}
