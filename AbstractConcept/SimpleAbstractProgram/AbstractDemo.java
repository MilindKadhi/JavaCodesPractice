/* A Class that is defined as abstract has the follwing uses 
 * It helps us to hide how things are implemented in the calss and only allows to acess functionalities 
 * When other classed Extends Abstract Class then all its method needs to be implemented and Abstract class has to be
 * extended it cannot just be intantiated . 
 */

abstract class AbstractDemo 
{

	AbstractDemo()
	{
	 System.out.println("The Abstract Class Demo Constructor invoked ");	
	}
	
	abstract void display();  // as you can see that an abstract method has no excutional statements and it is empty.
	
}

class AbstractDemo1 extends AbstractDemo
{
	
	void display()
	{
		System.out.println("This is a Display from Abstractdemo1 class extending Abstract class ");
	}
}

class AbstractDemo2 extends AbstractDemo
{
	
	void display()
	{
		System.out.println("The is a Display from Abstractdemo2 class extending Abstract class ");
		
	}
}