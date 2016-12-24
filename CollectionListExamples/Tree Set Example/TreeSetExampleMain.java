
/* The TreeSet is used in the followiong conditons 
 * when we have a set of elements in the list and we want to maintain a Ascending order .. of the list ..
 * it only sorts for  one Datatype at a time .. it cannot sort for multiple datatype in the list...
 */


import java.util.*;


public class TreeSetExampleMain {

	public static void main(String[] args) 
	{

		 TreeSet t1 = new TreeSet();  // we will use t1 to store only string type of data
		 TreeSet t2 = new TreeSet();  // we will use t2 to store only Integer type of data 
		 
		 t1.add("Milind");
		 t1.add("Jagdish");
		 t1.add("Kadhi");
		 
		 t2.add(7);
		 t2.add(5);
		 t2.add(1);
		 t2.add(4);
		 
		 
		 
		 
		 Iterator itr = t1.iterator();
		 Iterator itr1 = t2.iterator();
		 
		 System.out.println("Sorting in String Type using Tree Set ");
		 System.out.println(" ");
		 
		 while( itr.hasNext())
		 {
			 
			 System.out.println(itr.next());
		 }
		 
		 System.out.println(" ");
		 System.out.println("Sorting in Integer Type using Tree Set ");
		 
		 while (itr1.hasNext())
		 {
			 
			 System.out.println(itr1.next());
		 }
	}

}
