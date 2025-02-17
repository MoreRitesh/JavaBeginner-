import java.util.Scanner;
class EYcode
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int cnt=0;
		if (str.length()>0)
		{
			for (int i=0;i<str.length();i++ )
			{
				if (str.charAt(i)==1)
				{
					cnt++;
				}
				else if(str.charAt(i)==0)
					cnt=0;
				if (cnt==7)
				{
					break;
				}
			}
		}
		else

			System.out.println("invalid Input! ");
		if (cnt==7)
		{
			System.out.println("Yes ");
		}
		if(cnt!=7)
			System.out.println("No");
	}
}
