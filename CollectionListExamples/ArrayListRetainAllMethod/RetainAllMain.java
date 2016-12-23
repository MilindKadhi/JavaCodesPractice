// Using Retainall method we are able to check for duplication of elements and printing them .. 
// let us check that with an example 


import java.util.ArrayList;
import java.util.Iterator;


public class RetainAllMain {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		
		ArrayList<String> a2 = new ArrayList<String>(); // Creating one more arraylist of same type and ammending the arraylist
		
		a2.add("A"); 
		a2.add("D");
		
		a1.retainAll(a2);  // using the retain Al method we are able to check for same elements in arraylist and printing them. 
		
		
		System.out.println("Showing  Duplicate Elements using Retainall Method ");
		
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
