

class FirstDuplicateElementInArrayUsingLoop
{
	public static void main(String [] args)
	{
		int[]a={2,4,7,8,2,4,3};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.print("first duplicate element is "+a[i]);
					temp=temp+1;
					break;
				}
			}
			if(temp>0)
			{
			    break;
			}
		}
	}
}
