import java.util.Scanner;

public class inverted_half_pyramid {
    public static void inverted_half_pyramid_pattern(int row){
        
        for(int i=1; i<=row; i++){
            
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int Total_row = sc.nextInt();

        inverted_half_pyramid_pattern(Total_row);
        sc.close();
}
}
