
import java.util.Scanner;
class AccessArrayWithUserInput
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=s.nextInt();
        int []numbers=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
        {
            numbers[i]=s.nextInt();
        }
        System.out.println("Enter Element for search:");
        int item=s.nextInt();
        int count = 0;
        for(int i=0;i<numbers.length;i++)
        {

            if(item==numbers[i])
            {
                System.out.println(item+" is at "+i+" position.");
                 count++;
            }
        }
        if (count == 0) 
        {
            System.out.println(item+" is not found in above array.");
        }
        s.close();

    }
}