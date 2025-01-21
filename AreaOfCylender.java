import java.util.*;
public class AreaOfCylender {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius= sc.nextFloat();
        System.out.println("Enter the length: ");
        float length= sc.nextFloat();
        final float pi=(22/7);
        float area= 3.14f *radius*radius;
        float volume=area*length;
        System.out.println(area);
        System.out.println(volume);
    }
    
}