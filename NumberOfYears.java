import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the minutes");
		long minutes=sc.nextLong();


		long years=minutes/(60*24*365);
		System.out.println(years);
		


	}
}
