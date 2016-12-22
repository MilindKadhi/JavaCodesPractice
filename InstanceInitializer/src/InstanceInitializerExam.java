/* An Instance Initializer is used to Initialize the Instance ... 
 * it is used everytime the object of the class is created .. 
 * Here we will see how it is used and when it is called in the life of the program 
 * we will also take a Super() so that we knw when the super class is called and when is the instance called 
 */


public class InstanceInitializerExam 
{
	 InstanceInitializerExam() 
	{

		 System.out.println("The Parent class Invoker called ....");
	}

	
}

class InstanceExtends extends InstanceInitializerExam
{
	
	InstanceExtends()
	{
		super();
		System.out.println("The Subclass Invoker Called ... ");
		
	}
	
	
	{
		System.out.println("The Initalizer is Invoked from the SubClass ");
		
	}
	
}
