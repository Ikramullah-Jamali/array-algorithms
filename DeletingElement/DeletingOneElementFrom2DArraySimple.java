
class  DeletingOneElementFrom2DArraySimple
{
    public static void main(String[] args) 
    {
        
        int[][] arr = { {10,20,30}, {40,50,60}, {70,80,90} };  
        int delElement=50;
        int count=0;

        for (int i=0;i<arr.length;i++) 
        {
            for (int j=0;j<arr[i].length;j++) 
            {
                if (arr[i][j] == delElement) 
                {
                    arr[i][j] = 0; // Simulate deletion by setting it to 0
                    count++;
                    break;
                }
            }
            if (count > 0) break;
        }

        if (count == 0) 
        {
            System.out.println("Element not found.");
        } else 
        {
            System.out.println("Element deleted Successfully:");
            for (int i = 0; i < arr.length; i++) 
            {
                for (int j = 0; j < arr[i].length; j++) 
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}