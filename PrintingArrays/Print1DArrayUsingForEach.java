
// Program to print elements of a 1D array using 'for-each' loop

class  Print1DArrayUsingForEach
{
    public static void main(String [] args)
    {

        int[] a={10,20,30,40,50};
        int count=0;
        for (int i:a)
        {   
          count++;
          if (count == a.length)
          {
            System.out.print(i);
          }
          else
          {              
            System.out.print(i + " , ");
          }
        }
    }
}
         