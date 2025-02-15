import java.util.*;
class KSwap 
{
	public static void main(String[] args) 
	{
		//{1,2,3,4,5} K=2	Output: {3,4,5,1,2}
		int n=5;
		int[] arr={1,2,3,4,5};
		int k=2;
		int[] arr2 = new int[n];
		for (int i=0;i<k ;i++ )
		{
			arr2[i]=arr[i+3];
		}
		int b=0;
		for (int i=k;i<n ;i++ )
		{
			arr2[i]=arr[b];
			b++;
		}

		System.out.println(Arrays.toString(arr2));
	}
}
