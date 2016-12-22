
public class Descending 
{

	public void Sorting(int a[])
	{
		int n=a.length;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]<a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		
	}
}

/* The logic behind the Descending Sorting is as follows
 * 
 * First we make a Method which is accepts Int Arrays as input
 * Then we declare a variable which takes input as the length of the array ... 
 * so what we want to do here ... 
 * take a list of array ... 
 * Compare the a[0] and a[1]
 * Whichever is Greater swap it ... 
 * This is also Bubble Sort Technique ... 
 * Along with this we also have to compare the n and n-1 to get the smallest number in the array ,,  */
