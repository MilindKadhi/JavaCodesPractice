/* The main use of linked list is that it overcomes one major drawback that 
 * the Manipulation is fast since it does not need to be shifted unlike arraylist where 
 * Manilulation is slow
 * can store Duplicate elements 
 * 
 */

import java.util.*;

public class LinkedListMain
{

	public static void main(String[] args)
	{

	LinkedList<String> a1 = new LinkedList<String>();
	
	a1.add("A");
	a1.add("B");
	a1.add("C");
	a1.add("D");
	
	
	
	
	Iterator it = a1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
  }

}


