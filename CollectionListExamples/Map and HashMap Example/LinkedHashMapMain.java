/* Linked Hash Map is same as HashMap
 * The Only Diffrence is that it maintains the insertion order in the list . 
 */

import java.util.*;

public class LinkedHashMapMain {

	public static void main(String[] args) 
	
	{
		LinkedHashMap<Integer,String> lh1 = new LinkedHashMap<Integer, String>();
		LinkedHashMap<Integer, Integer> lh2 = new LinkedHashMap<>();   // we have to dclare the type of Key and value in HashMap
		
		   
		lh1.put(2, "Milind");   			// here we use put method to insert key and value in the object . 
		lh1.put(1, "Kadhi");
		lh1.put(3, "MMK");
		lh1.put(6, "JJK");
		lh1.put(null, null);
		lh1.put(null, null);  // here even if we insert two null values it only acepts one null value .. 
		
		
		lh2.put(2, 3);
		lh2.put(2, 3);
		lh2.put(1, 2);
		lh2.put(1, 2);
		lh2.put(5, 6);
		
		
		//h2.get(h1);
		//System.out.println(h2);
		
		
		for(Map.Entry m : lh1.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
			
			
		}
		System.out.println(" ");
		for(Map.Entry m1 : lh2.entrySet())
		{
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		
		
	}
	}


