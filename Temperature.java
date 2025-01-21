import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the celsius temperature to convert it to Fahrenheit:");
        float celsius= sc.nextFloat();
        float  fahrenheit= (9.0f/5.0f)*celsius+32;
        System.out.println("Farhrenheite temperature: "+fahrenheit);
        
    }
    
}
