class Frequency 
{
	public static void main(String[] args) 
	{
		long num=1231237321;
		System.out.println(num);
		for (int i=0;i<=9 ;i++ )
		{
			int count=0;
			
			for (long j=num;j>0 ;j/=10 )
			{
				long rem=j%10;

				if (i==rem)
				{
					count++;
				}

			}
			if (count!=0)
			{
				System.out.println(i+" : "+count);
			}
		}
		
	}
}
