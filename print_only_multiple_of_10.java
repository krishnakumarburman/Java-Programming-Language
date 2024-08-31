import java.util.*;

public class print_only_multiple_of_10 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int number = sc.nextInt();
            if (number%10 != 0){
                System.out.println(number);
            }
            else{
                System.out.println(number);
                break;
            }
        }
        sc.close();
    }
}
