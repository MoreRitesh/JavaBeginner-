import java.util.Scanner;
class Gratuity 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subtotal: ");
		float subtotal= sc.nextFloat();
		System.out.println("Enter the Gratuity rate in %: ");
		float gratuity= sc.nextFloat();
		float finalGratuity=(subtotal*gratuity)/100;
		float total=subtotal+finalGratuity;
		System.out.println("The tip is "+finalGratuity+" and Total is "+total);
		
	}
}
