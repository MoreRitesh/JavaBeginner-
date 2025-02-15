import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the marks out of 600: ");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		float per=(marks/600f)*100f;
		System.out.println((per>=35)?((per>=75)?("Persentage is: "+per+" And Student is Pass with Grade A."):((per>=60)?("Persentage is: "+per+" And Student is Pass with Grade B."):("Persentage is: "+per+" And Student is Pass with Grade C."))):("Persentage is: "+per+" And Student is Fail."));
	}
}
