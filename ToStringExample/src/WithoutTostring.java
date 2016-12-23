
public class WithoutTostring 
{

	int rollnum;
	int Id;
	String name;
	
	WithoutTostring(int rollnum, int Id, String name) // Creating a Parameterised Constructor 
	{
		this.rollnum = rollnum;    // here we are using this method because of the same name of the parameters 
		this.Id =Id;
		this.name = name;
}

	
}

/* Here we are declaring a class which does not have a tostring method in it and we will see what is the out put of the same .. 
this way we will see why tostring is a important concept in java 
*/
