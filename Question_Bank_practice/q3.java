package Question_Bank_practice;

import java.util.Scanner;

public class q3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("price of pencile = ");
        Float pencile = sc.nextFloat();
        System.out.print("price of pen = ");
        Float pen = sc.nextFloat();
        System.out.print("price of eraser = ");
        float eraser = sc.nextFloat();
        System.out.println("Your Total Bill (exclusive 18% GST) = " + (pencile+pen+eraser));
        Float TotalGST = ((pencile+pen+eraser)*18)/100;
        System.out.println("Your Total Bill (inclusive 18% GST) = " + (pencile+pen+eraser+TotalGST));
        sc.close();
    }
}