import java.util.Scanner;
class Vowels

{
	public static void main(String[] args) 
	{
		System.out.println("Enter the character: ");
		Scanner sc=new Scanner(System.in);
		char ch= sc.next().charAt(0);
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch+" is a vowel"):(ch+" is not a vowel"));

	}
}
