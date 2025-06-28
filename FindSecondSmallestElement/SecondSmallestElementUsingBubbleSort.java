
class SecondSmallestElementUsingBubbleSort
{
	public static void main(String [] args)
	{
		int [] a={11,13,9,15,4,7};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			    }
			}
		}
		// Print the sorted array
        System.out.print("Sorted array in ascending order: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		if (a.length >= 2)
    {
       System.out.println("\nSecond smallest number in array is: " + a[1]);
    }
    else
    {
        System.out.println("\nArray does not have a second smallest element.");
    }
	}
}	
