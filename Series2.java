class Series2 
{
	public static void main(String[] args) 
	{// 2 6 22 278 65814
	int num=2;
	int p=2;
	System.out.print(2+" ");

	for (int i=2;i<=5 ;i++ )
	{
		
		for (int j=1; j<=p;j++ )
		{
			num=(2*j)+num;
			
		}
		System.out.print(num+" ");
		p*=2;
	}
		
	}
}
