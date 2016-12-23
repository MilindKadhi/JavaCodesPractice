/* The use of Todting method() is that we can have a String Representation of any object 
 * if we donot write tostring() method in the code then Java will return a Hash code instead of the the actual string
 * of the object 
 * let us see with an example 
 * 
 */

public class TostringEg 
{

	int rollnum;
	int Id;
	String name;
	
	TostringEg(int rollnum, int Id, String name) // Creating a Parameterised Constructor 
	{
		this.rollnum = rollnum;    // here we are using this method because of the same name of the parameters 
		this.Id =Id;
		this.name = name;
				
	}
	
	
	public String toString()  // Here we are declaring tostring method so that we can print the details without a display method
	{

		return rollnum + " " +Id + " " +name;
		
	}
}

