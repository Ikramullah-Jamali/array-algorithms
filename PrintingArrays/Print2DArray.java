
// Program to print elements of a 2D array (including jagged arrays)

class Print2DArray
{
  public static void main(String[] args)
  {
    
    int[][] a={{10,20,30,40},{50,60},{70,80,90}};
       
    for(int i=0;i<a.length;i++)
    {
      for (int j=0;j<a[i].length;j++)
      {
        if (j == a[i].length - 1)
        {           
          System.out.print(a[i][j]);
        }
        else
        {
          System.out.print(a[i][j] + ", "); 
        }
                    
      }
      System.out.println();
           
    }
  }
}