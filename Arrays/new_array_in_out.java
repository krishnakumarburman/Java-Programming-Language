package Arrays;
import java.util.*;

public class new_array_in_out {
    public static void main (String args[]){
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in); 

        for (int i = 0 ; i < 5 ; i++){
            marks[i] = sc.nextInt();
        }

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(marks[i]);

        sc.close();
        }
    }
}
