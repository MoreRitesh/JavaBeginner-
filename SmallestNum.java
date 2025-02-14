import java.util.Scanner;
class SmallestNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four numbers: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		int num4= sc.nextInt();
		int sml= ((num1<num2)?((num1<num3)?((num1<num4)?(num1):(num4)):((num3<num4)?(num3):(num4))):((num2<num3)?((num2<num4)?(num2):(num4)):((num3<num4)?(num3):(num4))));
		System.out.println("argest number is: "+sml);

	}
}