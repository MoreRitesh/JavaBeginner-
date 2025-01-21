import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        final float pi=22.0f/7;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for radius: ");
        int r= sc.nextInt();
        float circleArea =pi*r*r;
        System.out.println("area of circle: "+ circleArea);
        float perimeter= 2*pi*r;
        System.out.println("perimeter of circle: "+ perimeter);

    }
    
}
