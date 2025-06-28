
class SecondLargestElementBySinglePass
{
	public static void main(String [] args)
	    
		{
			int [] a={10,3,7,1,4,81,54};
			int largest=Integer.MIN_VALUE;
			int second_largest=Integer.MIN_VALUE;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>largest)
				{
					second_largest=largest;
					largest=a[i];
				}
				else if(a[i]>second_largest && a[i]!=largest)
				{
					second_largest=a[i];
				}
			}
			 // Print the original array
        System.out.print("Array elements: ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(" "+a[i]+" ");
			}
			if(second_largest == Integer.MIN_VALUE)
			{
				System.out.print("\n There is no second largest element in the array. ");
			}
			else
			{
				System.out.print("\n Second largest value is: "+second_largest);
			}
			
		}
}