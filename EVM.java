import java.util.Scanner;
class EVM  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,ss=0,mns=0,nota=0;
		System.out.println("Enter the population: ");
		int population=sc.nextInt();
		for(int i=0;i<population;i++)
		{
			System.out.println(" *** Parties*** ");
			System.out.println("1. BJP ");
			System.out.println("2. Congress ");
			System.out.println("3. Shiv Sena ");
			System.out.println("4. MNS");
			System.out.println("5. NOTA ");
			System.out.println("\n Enter the Your vote: ");
			int vote=sc.nextInt();
			if (!(vote<=0&&vote>=6))
			{
				i--;
				System.out.println("\n Invalid input ! ");
				
			}
			if (vote==1)
			{ bjp++;
				System.out.println("Acche din ane vale hai! ");
			}
			if (vote==2)
			{ cng++;
				System.out.println("Bharat Jodo ! ");
			}
			if (vote==3)
			{ ss++;
				System.out.println("Ham hai asali shiv Sena ! ");
			}
			if (vote==4)
			{ mns++;
				System.out.println("Jai maharashtra ! ");
			}
			if (vote==5)
			{ nota++;
				System.out.println("You are a edjucated person ! ");
			}
			

		}
		if (bjp>=cng  && bjp>=ss && bjp>=mns && bjp>=nota)
		{
			System.out.println("\n BJP is the winner ");
		}
		if (cng>=bjp  && cng>=ss && cng>=mns && cng>=nota)
		{
			System.out.println("\n Congress is the winner ");
		}
		if (ss>=cng  && ss>=bjp && ss>=mns && ss>=nota)
		{
			System.out.println("\n Shiv-Sena is the winner ");
		}
		if (mns>=cng  && mns>=ss && mns>=bjp && mns>=nota)
		{
			System.out.println("\n MNS is the winner ");
		}
		if (nota>=cng  && nota>=ss && nota>=mns && nota>=bjp)
		{
			System.out.println("\n NOTA is the winner ");
		}
		

		

	}
} 
