

class RemoveDuplicatesUsingTempArray
{
    public static void main(String [] args)
	{
		int[] a={1,2,2,3,4,5,5,5};
		int[] temp=new int[a.length];
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[count]=a[i];
				count++;
			}
		} 
		temp[count]=a[a.length-1];
		for(int i=0;i<=count;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.print();
	}
}
