import java.util.*;

public class square_pattern{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=n ; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        sc.close();
    }
}