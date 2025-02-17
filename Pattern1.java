class Pattern1 
{
	public static void main(String[] args) 
	{
		int n=5;
		int cnt=1;
		int cnt2=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(cnt+" ");
				cnt++;
				//cnt2++;
			}
			System.out.println();			
			//cnt2=cnt;
		}
		
	}
}
