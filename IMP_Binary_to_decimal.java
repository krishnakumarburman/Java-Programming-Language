import java.util.*;

public class IMP_Binary_to_decimal {

    public static void decimal_conv(int n){
        int Binary_val = n;
        int decimal_val = 0;
        for (int i = 0 ; n > 0 ; i++){
            int last_digit = n % 10 ;
            decimal_val = decimal_val + (last_digit * (int)Math.pow(2 , i));
            n = n/10;
        }

        System.out.println(Binary_val + " " + "=" + " " + decimal_val);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int Binary = sc.nextInt();
        decimal_conv(Binary);
        sc.close();
    }
    
}
