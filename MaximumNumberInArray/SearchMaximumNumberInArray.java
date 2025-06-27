
class SearchMaximumNumberInArray
{
	public static void main(String [] args)
	{
		int[]arr={2,5,8,3,11,9};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximun number in array is: "+max);
	}
}
