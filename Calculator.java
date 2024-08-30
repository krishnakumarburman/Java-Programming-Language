import java.util.*;

public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0); // sc.next() take string type of value but we need char value so we use this , we will learn more about it in string subject.
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(operator){

            case '+' : System.out.println(a+b);
                    break;
            case '-' : System.out.println(a-b);
                    break;
            case '*' : System.out.println(a*b);
                    break;
            case '/' : System.out.println(a/b);
                    break;
            case '%' : System.out.println(a%b);
                    break;
            default : System.out.println("Wrong Operator");

        sc.close();
        }
    }
}
