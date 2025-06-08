
// Program to access elements of a 1D array with enhancements
class Accessing1DArray 
{

    public static void main(String[] args) 
    {

        int[] a = {10, 20, 30, 40, 50};

        // Print the full 1D array using traditional for loop
        System.out.println("Full 1D Array (using for loop):");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Print the full 1D array using for-each loop
        System.out.println("Full 1D Array (using for-each loop):");
        for (int value : a) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Element at [2] is: " + a[2]);
       
    }
}