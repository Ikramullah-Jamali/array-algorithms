import java.util.Scanner;

public class Accessing2DArrayWithUserInput 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements: ");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("\n2D Array elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}