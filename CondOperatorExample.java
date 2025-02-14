class CondOperatorExample 
{
	public static void main(String[] args) 
	{
		int a=12,b=21,c=11;
		int lar= (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		
		System.out.println(lar);
	}
}
