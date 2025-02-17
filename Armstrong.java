class Armstrong
{
	public static void main(String[] args) 
	{
		int num=153;
		int sum=0;
		int length=0;;
		int dup=num;
		for (int i=num;i>0 ;i/=10 )
		{
			length++;
		}
		while (num>0)
		{
			int pow=1;
			int rem=0;
			for (int j=1;j<= length ;j++ )
			{
				rem=num%10;
				pow*=rem;
			}
			sum+=pow;
			num/=10;

		}
		System.out.println(dup==sum?dup+" num is Armstrong":dup+" num is not an armstrong");
	}
}
