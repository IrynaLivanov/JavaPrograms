package class06;
import java.util.Scanner;

public class homeW06_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Total bill amount:");
        double price = sc.nextDouble();

        System.out.println("Enter Discount percentage;");
        double discount = sc.nextDouble();
        double percent = 100 - discount;

        double afterDiscount = (percent * price)/100;
        System.out.println("Final bill amount after discount is " + afterDiscount);

    }
}
