import java.util.*;

public class imp_reverse_number {
    public static void main(String arg[]){
        
        //agar kisi bi number ka last digit chiye too 10 sa % kar do.
        //agar kisi bi number ka last digit hatana ho too 10 sa divide kar do.

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number != 0){
            int last_digit = number % 10 ; 
            System.out.print(last_digit);
            number = number/10;
        }
    }
}
