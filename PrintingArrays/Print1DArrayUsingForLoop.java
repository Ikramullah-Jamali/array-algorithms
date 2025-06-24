
// Program to print elements of a 1D array using 'for' loop.

class Print1DArrayUsingForLoop   
{
   public static void main(String [] args)
   {

      int[] a=new int[3];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      
      for(int i=0;i<a.length;i++)        
      {  
         if (i == a.length - 1)
         {   
            System.out.print(a[i]);
         }
         else
         {      
            System.out.print(a[i] + " , ");
         }
      }
      
   }
}
