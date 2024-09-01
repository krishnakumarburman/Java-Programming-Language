import java.util.Scanner;

public class Binomial_coefficient {

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
        int r = sc.nextInt();
        int facto_n = factorial(n);
        int facto_r = factorial(r);
        int facto_nSUBr = factorial(n-r);

        System.out.println((facto_n)/((facto_r)*(facto_nSUBr)));

        sc.close();
    }
}
