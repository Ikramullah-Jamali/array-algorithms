
// Program demonstrating anonymous 2D array and summing its elements
public class Anonymous2DArray 
{

    public static void main(String[] args) 
    {
        System.out.println("Calculating Sum of Anonymous 2D Array elements:");
        sum(new int[][] { {10, 20, 30}, {40, 50} });  // Anonymous 2D array
    }

    public static void sum(int[][] num) 
    {
        int total=0;
        for (int[] row : num) {
            for (int element : row) {
                total += element;
            }
        }
        System.out.println("Sum is: " + total);
    }
}