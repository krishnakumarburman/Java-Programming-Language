import java.util.*;

public class for_loop1 {
    public static void main(String arg[]){
        // Syantax for FOR loop is :
        // for(initilisation ; condition ; updation){ }

        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 10 ; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
