

class InsertElementAtPosition    /* Insert value at any position of array */
{
	public static void main(String [] args)
	{
		int[] a={10,20,30,40,50,60,70,80};

		int element=100;  // Element to insert
		int pos=4;        // Position to insert (1-based index)
		
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		
		for(int i=0;i<a.length;i++)  //Print updated array
		{
			System.out.print(a[i]+" ");
		}
	}
}