import java.util.Scanner;
class MakePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int den=2;
		while(den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if(den==num)
		{
			System.out.println("Prime num");
		}

		else
		{

			int den2=2;
			for (int i=num; ; i++)
			{
				while(den2<i)
				{
					if (i%den2==0)
					{
						break;
					}
					den2++;
				}
				if (den2==i)
				{
					break;
				}


			}
			System.out.println("next Prime num: "+den2);

				
		}

		
	}
}
