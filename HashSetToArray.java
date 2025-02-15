import java.util.*;
class HashSetToArray 
{
	public static void main(String[] args) 
	{
		HashSet <Integer> set=new HashSet<>();
		int[] arr={1,1,2,3,4,3,5};
		for (int i=0;i<7 ;i++ )
		{
			int flag=0;
			for (int j=i+1;j<7 ;j++ )
			{
				if (arr[i]==arr[j])
				{ 
					flag=1;
				}
			}
			if (flag==0)
			{
				set.add(arr[i]);
			}
		}
		Integer[] arr2=set.toArray(new Integer[0]);
		System.out.println(arr2);

	}binary 
}
