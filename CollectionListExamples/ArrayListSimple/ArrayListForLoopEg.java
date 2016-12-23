/*In the Following Example we will see that how can we use ForLoop for Iterating the Elements in 
 * ArrayList ... using for loop
 * 
 */

import java.util.*;


public class ArrayListForLoopEg 
{

	ArrayList<String> a2 = new ArrayList<String>();
	
	void display()
	{
		a2.add("This is String");
		a2.add("1234");
		a2.add("1.345");
		
		for (String s1:a2)
		{
			System.out.println(a2);
		}
	}
	
	
	
}
