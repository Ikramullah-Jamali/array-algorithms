
class RemoveDuplicateElementsInPlace
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 2, 3, 4, 5, 5, 5};
        int count = 0;

        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] != a[i + 1])
            {
                a[count] = a[i];
                count++;
            }
        }
        a[count] = a[a.length - 1];

        for (int i = 0; i <= count; i++)
        {
            System.out.print(a[i] + " ");
        }
        
    }
}
