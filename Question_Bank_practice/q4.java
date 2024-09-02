package Question_Bank_practice;

import java.util.Scanner;

public class q4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2 ; i <= 10 ; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }

        sc.close();
    }
}
