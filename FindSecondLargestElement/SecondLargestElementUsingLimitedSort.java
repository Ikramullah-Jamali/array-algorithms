
class SecondLargestElementUsingLimitedSort
{
	public static void main(String [] args)
	{
		int [] a={11,6,9,15,4,7};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			    }
			}
			if(i==1)
		    {
		    	break;
	    	}
		}
		System.out.print("Partially sorted array (top 2 elements): ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		if (a.length >= 2) 
		{
            System.out.println("\nSecond largest number in array is: " + a[1]);
        } 
        else 
		{
            System.out.println("\nArray does not have a second largest number.");
        }
	}
}	