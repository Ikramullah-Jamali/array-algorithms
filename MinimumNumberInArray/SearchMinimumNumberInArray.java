

class SearchMinimumNumberInArray
{
	public static void main(String [] args)
	{
		int[] arr={19,15,8,18,3,7,13};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum number in array is: "+min);
	}
}
