import java.util.Scanner;

public class imp_prime_in_range {

    public static boolean isPrime(int n){
        boolean issPrime = true ;
        for (int i=2 ; i<=Math.sqrt(n) ; i++){
            if (n%i == 0){
                issPrime = false ;
                break ;
            }
        }

        return issPrime ;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2 ; i <= n ; i++){
            if (isPrime(i) == true){
                System.out.println(i) ;
            }
            else{
                continue; 
            }
        }

        sc.close();
    }
}
