/*ARRAY LIST IS A TYPE OF JAVA COLLECTIONS 
 * IT USES DYMANIC ARRAY FOR SORTING THE ELEMENTS 
 * IT CAN CONTAIN DUPLICATE ELEMENT
 * 
 * IN THE FOLLOWING EXAMPLE WE WILL SEE HOW WE TO ADD IN THE ARRAYLIST AND WE WILL PRINT THE VALUES ... 
 * We will see Generic as well as Non Generic Array List.. 
 */



import java.util.*; 									// we have to import tthis file for using collection framework 

public class SimpleArrayListExample 
{
	
	/* We are defining  is a Generic Colelction of list wher we have defined that the array will have String
	 * Type ... 
	 */
	
	ArrayList<String> a1 = new ArrayList<String>();  		 // Generic Declarations
	
	/* Now we will see that how to define a Non Generic Type of Collection whihc will not have the type 
	 * of List in the array 
	 * 
	 */
	
	ArrayList a = new ArrayList(); 							  // Non Generic Declaration
	

	
	void display()
	{
		a1.add("Milind");
		a1.add("NIIT");
		a1.add("Java");
		a1.add("DT");
		System.out.println("Generic Array List");
		System.out.println(a1);
					
	}
	
	void display2()
	{
		a.add(12);
		a.add("Monish");
		a.add(99.99);
		
		System.out.println("");
		System.out.println("Non Generic Array List");
		System.out.println(a);
	}
	
	

}

/* Here we can see that we can use add method and print it ... which can be called in the 
main class by passing a object to the class */
