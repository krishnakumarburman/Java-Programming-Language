import java.util.*;

public class prime_or_not {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime = true ; 

        if (number == 2){
            System.out.println("it's a prime number");
        }
        else{
            for (int i = 2 ; i<number-1 ; i++){
                if (number%i == 0){        // number is the multiple of i(i is not equal to 1 or number it self)
                    isPrime = false ; 
                    break;
                }
                else {
                    continue;
                }
                
            }
            
            if (isPrime == true){
                System.out.println("It's a Prime Number");
            }
            else{
                System.out.println("It's a Composite Number");
            }
        }

        sc.close();
    }
}
