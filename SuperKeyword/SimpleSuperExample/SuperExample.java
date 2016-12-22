//Super Keywrd is used to see the value of the the variable of the immediate Parent Class. 


public class SuperExample 
{

	int id = 20;
	
}


class Superextends extends SuperExample
{

	int id =30;
	
	void Display()
	{
		System.out.println("Displayong Super ID :- " +super.id);     // calling ID of Super Class 
		System.out.println("Displaying Id from Sub Class :" +id);           // Calling ID of Local Class 
		
	}
	
}