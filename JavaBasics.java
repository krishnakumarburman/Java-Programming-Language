import java.util.*;
//run on terminal
public class JavaBasics {
    public static void main(String arg[]){
        Scanner sc1 = new Scanner(System.in);
        //scanner is the class and sc is the object and we take System.in
        String input1 = sc1.next();
        //input is variable and .next is the function which captue the element in the variable and it only take to the before the space and if we have to store also after space we have to use .nectLine() function
        System.out.println(input1);


        Scanner sc2 = new Scanner(System.in);
        String input2 = sc2.nextLine();
        System.out.println(input2);

        // if we have to take input integer value than we have to use .nextInt()
        Scanner sc3 = new Scanner(System.in);
        int input3 = sc3.nextInt();
        System.out.println(input3);

        // and for flout value we will use .nextFloat()
        Scanner sc4 = new Scanner(System.in);
        float input4 = sc4.nextFloat();
        System.out.println(input4);
    }
}

//boilerplate code