package class05;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

public class SwabNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int c;
         c = a;
         a = b;
         b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
