package class05;
import java.util.Scanner;

public class homeW05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the word1");
        String word1 = sc.next();
        System.out.println("Enter the word2");
        String word2 = sc.next();
        String word3;

        word3 = word1;
        word1 = word2;
        word2 = word3;

        System.out.println(word1);
        System.out.println(word2);


    }
}
