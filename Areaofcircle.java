import java.util.*;

public class Areaofcircle{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        // if we give any decimal value in our program than java take it as double so if we want to store it as float than we have to write 'f' after decimal value.
        Float area = 3.14f * radius * radius ;
        System.out.println(area);
    }
}