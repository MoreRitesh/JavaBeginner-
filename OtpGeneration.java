class OtpGeneration 
{
	public static void main(String[] args) 
	{
		String otp="";
		for (int cnt=1;cnt<=5 ; )
		{
			otp+=(int)(Math.random()*1000000);
			if (otp.length()==6)
			{
				System.out.println(otp);
				cnt++;
			}
		}
		System.out.println("Hello World!");
	}
}
