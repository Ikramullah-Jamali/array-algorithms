
class FindMissingNumberInArray
{
	public static void main(String [] args)
	{
		int[] a={1,2,3,4,5,6,7,9,10};
		
		int ExpectedNumberOfElements=a.length+1;
		int ExpectedTotalSum=ExpectedNumberOfElements*(ExpectedNumberOfElements+1)/2;
		int actualSum=0;
		for(int i=0;i<a.length;i++)
		{
			actualSum=actualSum+a[i];
		}
		System.out.println("Missing number is: "+(ExpectedTotalSum-actualSum));
	}
}