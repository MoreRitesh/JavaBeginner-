import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month: ");
		String mon=sc.next().toUpperCase();
		String str= (mon.equals("FEB")||mon.equals("MAR")||mon.equals("APR")||mon.equals("MAY"))?("Summer"):((mon.equals("JUN")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("SEP"))?("Monsoon"):((mon.equals("OCT")||mon.equals("NOV")||mon.equals("SEC")||mon.equals("JAN"))?("Winter"):("not valid input")));

		System.out.println(str);
	}
}
