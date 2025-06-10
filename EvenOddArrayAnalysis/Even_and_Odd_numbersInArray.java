

import java.util.ArrayList;

class Even_and_Odd_numbersInArray
{
	
	 /* || In this program, we have 6 different program's:
	    ||  1: Find Even numbers        2: Find Odd numbers
	    ||  3: How many Even numbers's  4: How many Odd numbers's
	    ||  5: Sum of Even numbers's    6: Sum of Odd numbers's   */


	   public static void main(String [] args) 
	{
		int[] a={23,44,12,15,41,8};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		int temp1=0;
		int temp2=0;
		System.out.println("Total Even numbers in Array are: "+al1.size());
		for(int num:al1)
		{
			temp1 += num;
			System.out.print(num+" ");
		}
		System.out.println("\nSum of Even number's:"+ temp1);
		System.out.println("--------------------------------------");
		System.out.println("Total Odd number's in Array are: "+al2.size());
		for(int num:al2)
		{
			temp2 += num;
			System.out.print(num+" ");
		}
		System.out.println("\nSum of Odd number's:"+ temp2);	
	}
}
