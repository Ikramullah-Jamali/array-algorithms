
import java.util.Set;
import java.util.HashSet;

class FindDuplicateElementsUsingSet 
{
    public static void main(String[] args) 
	  {
        int[] a = {3,5,4,3,6,6,1};
		    System.out.print("Original Array is: ");
        for(int i=0;i<a.length;i++) 
	    	{
            System.out.print(a[i]+" ");
        }

        System.out.print("\nDuplicate elements in that array are: ");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> printed = new HashSet<>();

        for(int num : a) 
        {
            if(!seen.add(num) && !printed.contains(num)) 
			      {
                System.out.print(num+" ");
                printed.add(num);
            }
        }
    }
}
