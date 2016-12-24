/*The Hashtable is used in the following condtions 
 * when we want to have Synchronisation
 * when we want the resource to be thread safe and shared with multiple threads 
 */

import java.util.*;

public class HashTableMain {

	public static void main(String[] args) 
	{
			Hashtable<Integer, String> h1 = new Hashtable<>();
			Hashtable<String, Integer> h2 = new Hashtable<>();
			Hashtable<Integer, String> h3 = new Hashtable<>();
			
			
			
			h1.put(1, "Milind");
			h1.put(2, "MMK");
			h1.put(7, "MMK");
			h1.put(3, "NJK");
			
			h2.put("M", 1);
			h2.put("W", 4);
			h2.put("A", 2);
			h2.put("Z", 9);
			
			h3.put(1, "A");
			h3.put(8, "D");
			h3.put(2, "B");
			
			
			
			
			
			for(Map.Entry m1 : h1.entrySet())
			{
				System.out.println(m1.getKey() + " " + m1.getValue());
			
			}
			
			System.out.println(" ");
			for(Map.Entry m2 : h2.entrySet())
			{
				System.out.println(m2.getKey() + " " + m2.getValue());
			}
			
			System.out.println(" ");
			for(Map.Entry m3 : h3.entrySet())
			{
				System.out.println(m3.getKey() + " " + m3.getValue());
			}
			
			
	}

}
