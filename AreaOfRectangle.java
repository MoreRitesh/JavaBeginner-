import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the length of rectangle: ");
        float length=sc.nextFloat();

        System.out.println("enter the width of rectangle: ");
        float width=sc.nextFloat();
        float areaOfRectangle= length*width;
        System.out.println("area of rectangle is : "+ areaOfRectangle);
    }
    
}
