/*For List Examples we will in many cases creating only one main class to make it easy for acess 
 * in this example we will be seeing how to use AddAll method in Arraylist
 * 
 */


import java.util.*;


public class AddallMain {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		
		
		ArrayList<String> a2 = new ArrayList<String>(); // Creating one more arraylist of same type and ammending the arraylist
		
		a2.add("E Added"); 
		a2.add("F Added");
		
		a1.addAll(a2);  // using the addall method we are able to add the new elements in the arraylist .. 
		
		/* Remember we will be using Iterator method in all the Arraylist Examples
		 * This is a really helpful Functionality whihc helps in the List examples 
		 * 
		 */
		
		Iterator it = a1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
