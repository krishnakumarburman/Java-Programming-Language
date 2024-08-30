import java.util.*;

public class sum_while {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0 ;
        while (counter <= range){
            sum = sum + counter ;
            counter++;
        }
        System.out.print(sum);
        sc.close();
    }
}
