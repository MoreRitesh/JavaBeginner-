import java.util.Scanner;
class PrimeNum

{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		System.out.println((num==2||num==3||num==5)?(num+"Number is prime"):((num%2==0||num%3==0||num%5==0)?(num+"is not a prime"):(num+"is prime")));
		
	}
}
