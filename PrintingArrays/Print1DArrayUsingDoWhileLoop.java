
// Program to print elements of a 1D array using do-while loop

class Print1DArrayUsingDoWhileLoop
{

    public static void main(String [] args)
    {
        int [] a={10,20,30};
        int i=0;
        do
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
        while( i<a.length);

    }
}
