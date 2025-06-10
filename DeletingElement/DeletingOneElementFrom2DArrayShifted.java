
class DeletingOneElementFrom2DArrayShifted 
{
    public static void main(String[] args) 
    {
        
        int[][] arr = { {10,20,30}, {40,50,60},{70,80,90} };
        int delElement=50;
        int totalElements=arr.length * arr[0].length;
        int[] flat=new int[totalElements];
        int index=0;

        // Flatten 2D array into 1D
        for (int i=0;i<arr.length;i++) 
        {
            for (int j=0;j<arr[i].length;j++) 
            {
                flat[index++] = arr[i][j];
            }
        }

        // Delete element by shifting
        int count=0;
        for (int i=0;i<flat.length;i++) 
        {
            if (flat[i] == delElement) 
            {
                for (int j=i;j<flat.length - 1;j++) 
                {
                    flat[j]=flat[j + 1];
                }
                count++;
                break;
            }
        }

        if (count == 0) 
        {
            System.out.println("Element not found.");
        } 
        else 
        {
            System.out.println("Element deleted Successfully:");
            int newTotal=totalElements - 1;
            int cols=arr[0].length;
            for (int i=0;i<newTotal;i++) 
            {
                System.out.print(flat[i] + " ");
                if ((i + 1) % cols == 0) 
                {
                    System.out.println();
                }
            }
        }
    }
}