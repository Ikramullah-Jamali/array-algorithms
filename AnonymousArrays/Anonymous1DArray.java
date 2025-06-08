
// Program demonstrating anonymous 1D array and summing its elements
public class Anonymous1DArray 
{

    public static void main(String[] args) 
    {
        System.out.println("Calculating sum of anonymous 1D array elements:");
        sum(new int[]{10, 20, 30});  // anonymous array passed directly
    }

    public static void sum(int[] num) 
    {
        int total=0;
        for (int i:num) 
        {
            total += i;
        }
        System.out.println("Sum is: " + total);
    }
}
