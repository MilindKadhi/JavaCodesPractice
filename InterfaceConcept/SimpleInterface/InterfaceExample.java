/* Interface is just like abstraction in java where we can use only
 * all the methods declared in Interface are Abstract only 
 * through Interface we can also perform Multiple inheritance since we can implememt multiple Interfaces in one class
 * we Dont Extend Interface we "Implement" ... 
 * 
 */

interface InterfaceExample 
{

	void First();
	void second();
	void Third();
	
}

class InterfaceImplement implements InterfaceExample
{
	 public void First()
	{
		System.out.println("Display from Firt method in Interface");
	}
	public void second()
	{
		System.out.println("Implements from Second Method in Interface");
	}
	
	public void Third()
	{
		System.out.println("Display from Third method in interface");
	}
}