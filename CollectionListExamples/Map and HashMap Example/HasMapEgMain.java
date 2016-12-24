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
		
		h1.put(2, "Milind");
		h1.put(1, "Kadhi");
		h1.put(3, "MMK");
		
		for(Map.Entry m : h1.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
			
			
		}
		
		
		
		
	}

}
