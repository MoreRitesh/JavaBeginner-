class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num=1212;
		int temp=0;
		int evenSum=0,oddSum=0;
		int rem=0;
		rem=num%10;
		temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
		
		num=num/10;

		rem=num%10;
		temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
		num=num/10;

		rem=num%10;
		temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
		

		System.out.println(evenSum+"\n"+oddSum);
	}
}
