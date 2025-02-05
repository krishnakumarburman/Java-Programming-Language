import java.util.Scanner;

public class Hollow_rectangle_pattern{

    public static void Hollow_rectangle(int row , int col){
        //outer loop
        for(int i=1; i<=row; i++){
            //ineer - col
            for(int j=1; j<=col; j++){
                //cell-(i,j)
                if(i == 1 || i== row || j==1 || j==col){
                    //boundary cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int Total_row = sc.nextInt();
        int Total_col = sc.nextInt();

        Hollow_rectangle(Total_row, Total_col);
        sc.close();
    }}
