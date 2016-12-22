// here we will see how can we use Parameterised Constructor to Provide Values when a Object is created in main class

public class Paraconstruct 
{
	int RollNum;
	String name;
	
	// here we have created a Parametirsed Constructor which will be invoked at the time of creation of object which
	// will have the same parameters as passed in the constructor 
	// we knw a constructor because it does have the same name as the calss and no return type is mentioned
	
	public Paraconstruct(int rn,String nme ) 
	{
		// TODO Auto-generated constructor stub
		
		RollNum = rn;
		name = nme;
		
	}

	void Display()
	{
		System.out.println("The Roll number is  :" +RollNum + " and the name is : " +name );
		
	}
	
}
