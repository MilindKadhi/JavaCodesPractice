
public class Minimum 
{

	public void minofarray(int a[])  // we are making a function which will give the minimum of array 
	{
		int min = a[0]; // initially the min is 0 
		
		for (int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];  // if the condition is true then it will store min with the a[i] value and againcompare . 
				
				
			}
		}
		
		
		System.out.println("The minimum of the Given Array is : " +min);
	}
}
