
import java.util.Scanner;
class AccessArrayWithUserInputStrings
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=s.nextInt();
        String name[]=new String[size];
        System.out.println("Enter Elements of array:");
        for(int i=0;i<size;i++)
        {
            name[i]=s.next();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("names:"+(i+1)+" is "+name[i]);
        }
        s.close();
    }
}