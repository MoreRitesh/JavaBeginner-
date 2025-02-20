class FacinatingNum 
{
	public static void main(String[] args) 
	{
		int num=327;
		String str=327+""+(num*2)+ (num*3);
		boolean flag=true;
		int cnt=0;

		for (char i='1';i<='9' ;i++)
		{
			for ( int j=1;j<str.length() ;j++ )
			{
				char ch=str.charAt(j);
				if (ch==i)
				{
					cnt++;
				}
			}
			if (cnt!=1)
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
			System.out.println(num +" is a Facinating num");
		}
		else
			System.out.println(num +" is  not a Facinating num");
		
	}
}
