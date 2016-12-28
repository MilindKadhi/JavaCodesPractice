/* In the following program we are seeing how we can use enum to declare values and call them in main method ... 
 * this is one more functionality of enum 
 * in enum we can have constructors, methods and also define diffrent values ...
 * all the cnstructors in enum class are to be private  and if we dont declate it private then the compiler
 * will automatically declare it private .  
 */


public  class GivingValuetoEnum 
{

	enum GiveValue
	{
		ROLLNUM(10),ID(20),NUMBER(12345);
		
		
		 int value;
		
		 GiveValue(int value)
		{
			this.value=value;
			
		} 
		 		
		
	}
	public static void main(String[] ag)
	{
		for(GiveValue g : GiveValue.values())
			System.out.println(g+ " " +g.value);
			
	}
	
}

 