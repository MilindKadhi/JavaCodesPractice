/* Sorting is used when we want to sort list type of elements 
 * Sorting is Can Sort 
 * String Objects 
 * Wrapper Class Object 
 * User Defined class Object 
 * Now we will see with eg sorting  
 * 
 */


import java.util.*;
public class SortingExMain {

	public static void main(String[] args)
	{
		
		
		
		ArrayList s1 = new ArrayList<>();
		ArrayList s2 = new ArrayList<>();
		
		s2.add(Integer.valueOf(10));      // By using Integer.value class we can take integer values to the ArrayList
		s2.add(Integer.valueOf(5));
		s2.add(Integer.valueOf(1));
		s2.add(Integer.valueOf(9));
		
	
		
		s1.add("A");
		s1.add("B");
		s1.add("D");
		s1.add("C");
		
		Collections.sort(s1);
		Collections.sort(s2);
	
		
		Iterator i1 = s1.iterator();
				while(i1.hasNext())
				{
					System.out.println(i1.next());
					
				}
		
				System.out.println("");
		Iterator i2 = s2.iterator();
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
				
		
	}

}
