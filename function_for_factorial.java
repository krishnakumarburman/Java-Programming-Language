import java.util.*;

public class function_for_factorial {

    public static int factorial(int n){
        int facto = 1 ;
        for(int i = n ; i>0 ; i--){
            facto = facto * i ;
        }
        return facto ;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

        sc.close();
    }
}
