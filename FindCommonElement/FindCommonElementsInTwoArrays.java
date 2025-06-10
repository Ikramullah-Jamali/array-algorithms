
import java.util.HashSet;

class FindCommonElementsInTwoArrays 
{
    public static void main(String[] args) 
	 {
        int[] arr1={4,3,7,9,2,4};
        int[] arr2={5,1,4,8,3};
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0;i<arr1.length;i++) 
		   {
            for (int j=0;j<arr2.length;j++) 
		      	{
                if (arr1[i] == arr2[j]) 
			        	{
                    hs.add(arr1[i]);
                    break;
                }
            }
        }

        System.out.print("Common elements: ");
        int count = 0;
        for (int no : hs) 
	    	{
            System.out.print(no);
            count++;
            if (count < hs.size()) System.out.print(", ");
        }
    }
}
