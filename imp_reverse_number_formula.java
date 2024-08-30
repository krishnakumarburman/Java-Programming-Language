import java.util.*;

public class imp_reverse_number_formula {
    public static void main(String arg[]){

        
        // Reverse = (Reverse * 10) + last_digit


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        while ( number != 0){
            int last_digit = number % 10 ;
            rev = (rev * 10) + last_digit ;
            number = number/10 ; 
        }
        System.out.println(rev);
        sc.close();
    }
}
