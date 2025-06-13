
class KthLargestNumberInArray
{
	public static void main(String [] args)
	
		{
			int [] a={19,20,37,10,8,3,21};
			int k=4;
			
			if (k <= 0 || k > a.length) 
			{
           		System.out.println("Invalid value of k. It must be between 1 and " + a.length);
            	return;
            }

			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}

			System.out.println(k+" largest element is "+a[k-1]);			
			System.out.println("--------------------");

			for(int i=0;i<a.length;i++)  // Print the full sorted array
			{
				System.out.print(a[i]+" ");
			}
		}
}
			
			
