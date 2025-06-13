
class KthSmallestNumberInArray
{
	public static void main(String [] args)
	
		{
			int [] a={19,24,17,81,62,93,26};
			int k=3;

			if (k <= 0 || k > a.length) 
			{
          	  	System.out.println("Invalid value of k. It must be between 1 and " + a.length);
            	return;
            }
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
				
			System.out.println(k+" Smallest element is "+a[k-1]);
			System.out.println("------------------------");
			System.out.print("Sorted array: ");

			for(int i=0;i<a.length;i++)
			{
				System.out.print(+a[i]+" ");
			}
		}
}
			
			
