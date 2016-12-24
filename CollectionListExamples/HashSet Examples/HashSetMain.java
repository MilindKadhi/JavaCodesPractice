/* The HashSet Class is used in the following cases 
 * when we dont want to store any duplicate objects in the list
 * 
 * Now we will see a simple exaple of HashSet class and see the output
 * 
 */



import java.util.*;

public class HashSetMain {

	public static void main(String[] args) 
	{
		
		HashSet hs = new HashSet();
		
		hs.add("Milind");
		hs.add("Kadhi");
		hs.add("Mansi");
		hs.add("Kadhi");
		hs.add("JJK");
		hs.add("Kadhi");
		hs.add("Kadhi");
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				

		
	}

}

/*if you run this code ideally if we use list then the output will be [Milind, Kadhi, Mansi, Kadhi]
where you ca see that Kadhi is repeated .. but because we use HashSet class we will get a output 
[Milind Kadhi Mansi]
*/

