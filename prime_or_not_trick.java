import java.util.*;

public class prime_or_not_trick {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System .out.println("It's a prime number");
        }
        else{
            boolean isPrime = true ; 
            for (int i = 2 ; i<Math.sqrt(n) ; i++){ // Math.sqrt is the method of wrighting underroot
                if (n%i == 0){
                    isPrime = false ; 
                }
            }

            if (isPrime == true){
                System.out.println("It's a Prime number");
            }
            else{
                System.out.println("It's a Composite number");
            }
        }
        sc.close();
    }
}
