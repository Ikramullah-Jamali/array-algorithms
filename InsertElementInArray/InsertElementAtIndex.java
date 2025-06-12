

class InsertElementAtIndex    /* insert value at any index position of array */
{
	public static void main(String [] args)
	{
		int[] a={10,20,30,40,50,60,70,80};

		int element=100;  // Element to insert
		int index_pos=4;  // Index where to insert (0-based)
		
		for(int i=a.length-1;i>index_pos;i--)
		{
			a[i]=a[i-1];
		}
		a[index_pos]=element;

		for(int i=0;i<a.length;i++)  //Print updated array
		{
			System.out.print(a[i]+" ");
		}
	}
}
