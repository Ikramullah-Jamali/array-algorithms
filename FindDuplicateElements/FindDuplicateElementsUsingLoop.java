
class 	FindDuplicateElementsUsingLoop 
{
    public static void main(String[] args) 
	  {
        int[] a = {4,7,2,4,8,2,6};
        boolean[] isDup = new boolean[a.length];
	    	System.out.print("Original Array is: ");
        for(int i=0;i<a.length;i++) 
		    {
            System.out.print(+a[i]+" ");
        }

        System.out.print("\nDuplicate elements in that array are:");
        for(int i=0;i<a.length-1;i++) 
		    {
            if(isDup[i]) continue;

            for(int j=i+1; j<a.length;j++) 
			      {
                if(a[i] == a[j]) 
			        	{
                    if(!isDup[i]) 
				          	{
                        System.out.print(" "+a[i]);
                        isDup[i]=true;
                    }
                    isDup[j]=true;
                }
            }
        }
    }
}
