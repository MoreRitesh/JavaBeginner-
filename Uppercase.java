import java.util.Scanner;
class Uppercase 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the character: ");
		Scanner sc = new Scanner(System.in);
		char ch= sc.next().charAt(0);
		System.out.println(((ch>=65&&ch<=90)||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?(ch+" is an UpperCase alphabet"):(ch+" is an LowerCase alphabet")):((ch>='0'&&ch<='9')?(ch+" is a Digit"):(ch+" is a Special Character")));
	}
}
