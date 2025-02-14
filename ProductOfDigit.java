import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int prd=1;
		int rem=num%10;
		prd=prd*rem;
		num=num/10;
		
		rem=num%10;
		prd=prd*rem;
		num=num/10;

		rem=num%10;
		prd=prd*rem;
		num=num/10;

		rem=num%10;
		prd=prd*rem;
		num=num/10;

		System.out.println("The Product of digits of number is: "+prd);

	}
}
