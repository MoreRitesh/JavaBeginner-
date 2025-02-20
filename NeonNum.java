import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbber: ");
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		for (int i=sqr;i>0 ;i/=10)
		{
			int rem=i%10;
			sum=sum+rem;
		}
	System.out.println(sum);
		if (sum==num)
		{
			System.out.println(num +"is an NeonNum");
		}else
			System.out.println(num +"is not an NeonNum");


	}
}