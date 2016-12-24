

/* The linked HashSet is a type of hashset that is used in the condition 
 * when we want to maintain the Order of Insertion ... 
 * let us check with an example
 */

import java.util.*;

public class LinkedHashSetMain {

	public static void main(String[] args) 
	{

	    LinkedHashSet ls = new LinkedHashSet();  // We use LinkedHashSet to maintin the insertion Oder in the List . 
		
		ls.add("Milind");
		ls.add("Kadhi");
		ls.add("Mansi");
		ls.add("Kadhi");
		ls.add("JJK");
		ls.add("Kadhi");
		ls.add("Kadhi");
		
		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
