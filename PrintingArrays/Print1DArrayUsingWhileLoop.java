
// Program to print elements of a 1D array using while loop

class Print1DArrayUsingWhileLoop  
{

    public static void main(String [] args)

       {
 
           int [] a={10,20,30};
           
           int i=0;
           while( i<a.length)
           {
                if (i == a.length - 1)
                {  
                    System.out.print(a[i]);
                }
                else
                {
                    System.out.print(a[i] + " , ");
                }
                i++;
           }
      }
}
