package class06;
import java.util.Scanner;

public class homeW06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float p,r,t, simpleInterest;
        System.out.println("Enter the Principal amount:");
        p = sc.nextFloat();

        System.out.println("Enter the Rate of interest");
        r = sc.nextFloat();

        System.out.println("Enter the Time period in years");
        t = sc.nextFloat();

        simpleInterest = (p * r * t)/100;
        System.out.println("The Simple interest for Principal amount " + p + " is " + simpleInterest);

    }
}
