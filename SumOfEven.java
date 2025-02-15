import java.util.Scanner;
class SumOfEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int sum2=0;
		while(num>0)
		{
			int rem= num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
		while (dup>0)
		{
			int rem=dup%10;

			if (dup%2==0)
			{
				sum2+=rem;
			}
			dup=dup/10;
		}
		System.out.println(sum2);
	}
}
