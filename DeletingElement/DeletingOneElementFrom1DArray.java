

class DeletingOneElementFrom1DArray
{
	public static void main(String [] args)
	{
		int[] a={10,20,30,40,50};
		int delElement=30;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(delElement==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				count++ ;
				break;
			}
		}	
		if(count==0)
		{
			System.out.println("Element not found.");
		}
		else
		{
			System.out.println("Element Delete Successfully: ");
		    for(int i=0;i<a.length-1;i++)
		        {
			        System.out.print(a[i]+" ");
		        }
		}
	}
}
		
