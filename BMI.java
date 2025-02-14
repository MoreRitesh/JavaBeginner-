import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Weight and height: ");
		
		float weight=sc.nextFloat();
		float height =sc.nextFloat();
		float newWeight=weight*0.45359237f;
		float newHeight=height*0.0254f;
		float bmi= newWeight/(newHeight*newHeight);
		System.out.println("BMI is : "+bmi);

	}
}
