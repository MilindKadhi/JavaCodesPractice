/* Now we will see what is a list iterator interface... the list iterator interface 
 * it helps up to insert and delete the elements 
 * it is also uses to  raverse the element in backward and forward direction.
 */



import java.util.*;


public class ListIteratorMain {

	public static void main(String[] args) 
	{
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add("Milind");
		a1.add(5);
		a1.add("Kadhi");
		a1.add("Mansi");
		a1.add("Kadhi");
		
		System.out.println("The Element at second position is :- " +a1.get(1));    // Using Get() mehthod to display specific value in the Arraylist
		
		a1.remove(1);                           // This method is used to Remove the Specific Element from the Specific Index.. 
		
		
		ListIterator itr = a1.listIterator(); // Using ListIterator for Forward and reverse Order ...
		
		System.out.println("");
		System.out.println("Travesing in forward direction");
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());			
		}
		
		
		System.out.println("");
		System.out.println("Travesing in reverse order ");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		System.out.println("");
		System.out.println("No we will use Set the value in the Arraylist ");
		System.out.println("");
		
		while(itr.hasNext())
		{
			a1.set(0, "MMK");					  // herer we are using Set Method to change the value at the specific index ... 
			System.out.println(itr.next());
		}
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}

}
