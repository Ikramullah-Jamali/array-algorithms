
import java.util.HashSet;
class RemoveDuplicatesFromUnsortedArray
{
	public static void main(String [] args)
	{
		int[] arr={1,4,2,3,4,5,2,5};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(int num:set)
		{
			System.out.print(num+" ");
		}
	}
}