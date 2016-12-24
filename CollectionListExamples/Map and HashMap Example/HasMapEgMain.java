/*The Map concept in Java Means that everything is sotrd in the form of Key and Value
 * it Prevents Duplication of values 
 * WE will understand the Concept of Map using Hash Map 
 * While using HAshMap for Map concept, we need to knw that 
 * the HashMap will only contain Unique Elements 
 * it may have only one null value ... 
 * It will not maintain any order ... 
 * 
 * Let us see with ad example 
 * 
 */


import java.util.*;

public class HasMapEgMain {

	public static void main(String[] args) 
	{

		HashMap<Integer,String> h1 = new HashMap<Integer, String>();
		HashMap<Integer, Integer> h2 = new HashMap<>();   // we have to dclare the type of Key and value in HashMap
		
		   
		h1.put(2, "Milind");   			// here we use put method to insert key and value in the object . 
		h1.put(1, "Kadhi");
		h1.put(3, "ABCD");
		
		h2.put(2, 3);
		h2.put(2, 3);
		h2.put(1, 2);
		h2.put(1, 2);
		
		//h2.get(h1);
		//System.out.println(h2);
		
		
		for(Map.Entry m : h1.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
			
			
		}
		
		System.out.println("");
		
		for(Map.Entry m1 : h2.entrySet())
		{
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		
		
	}

}
