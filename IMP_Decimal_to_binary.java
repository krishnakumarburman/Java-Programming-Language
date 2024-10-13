import java.util.*;

public class IMP_Decimal_to_binary {

    public static void converter(int n){
        int org_nim = n ;
        int Binary = 0 ;

        for (int i = 0 ; n > 0 ; i++){
            int rem = n % 2 ;
            Binary = Binary + (rem*(int)Math.pow(10 , i));
            n = n/2 ;
        }

        System.out.println(org_nim + " " + "=" + " " +Binary);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        converter(number);

        sc.close();
    }
}
