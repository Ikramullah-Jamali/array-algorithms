
// Program to access elements of a 2D (jagged) array
public class Accessing2DArray
{

     public static void main(String [] args)

        {

            int [][] a={ {10,20,30,40},{50,60},{70,80,90}};

            System.out.println("Full 2D Array:");
            for (int i = 0; i < a.length; i++) 
            {
                for (int j = 0; j < a[i].length; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(); 
            }

            // Print a specific element
            System.out.println("Element at [0][1] is: "+a[0][1]);
        }
 }
