
import java.util.HashSet;
class FirstDuplicateElementInArrayUsingHashSet  /* Collections Method  */
{
	public static void main(String [] args)
	{
		int[] a={3,8,2,7,9,2,9};
		int temp=-1;
	    HashSet<Integer> hs=new HashSet<>();
		for (int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
				temp=i;
			}
			else 
			{
			    hs.add(a[i]);
		    }
		}
		if(temp != -1)
		{
		    System.out.println("First duplicate element is "+a[temp]);
		}
		else
		{
			System.out.println("No dulpicate element found.");
		}
	}
}
			
		
		
		