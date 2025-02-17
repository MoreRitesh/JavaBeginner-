
import java.util.Scanner;
class PhonePin 
{
	public static void main(String[] args)throws InterruptedException 
	{

		Scanner sc=new Scanner(System.in);
		int storedPin = 143;
		
		int seconds=5000;
		outerloop:
		do
		{
			int attempt=3;
			System.out.println("Enter your Pin: ");
			int pin=sc.nextInt();
			attempt--;
			if (pin==storedPin)
			{
				System.out.println("Pnone Unlocked! ");
				break outerloop;

			}
			else
			{
				System.out.println("Wrong Pin!");
				System.out.println("Attempt Lef: "+ attempt);
			}

		}
		while (attempt>0);
		System.out.println();
		System.out.println("Phone is Disabled For "+seconds/1000+" seconds");
		Thread.sleep(seconds);
		seconds*=2;
		System.out.println();
		
	}
}
