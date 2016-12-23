/* In the Following code we will see how can we implement Enum using Switch Case Loop 
 * Here we are taking simple example of Days where we are selecting Monday 
 * and trough Switch case we are able to prnt that the day is Monday .
 */

public class EnumSwitchmain
{
	
	enum Days{ Sunday, Monday, Tuesday, Wednesday, Thurday, Friday, Saturday}
	
	public static void main(String ag[])
	{
		
		Days D = Days.Monday;
		
		switch(D)
		{
		   case Sunday:
			   System.out.println("The day is Sunday");
			   break;

		   case Monday:
			   System.out.println("The day is Monday");
			   break;
		   case Tuesday:
			   System.out.println("The day is Tuesday");
			   break;

		   case Wednesday:
			   System.out.println("The day is Wednesday");
			   break;

		   case Thurday:
			   System.out.println("The day is Thursday");
			   break;

		   case Friday:
			   System.out.println("The day is Friday");
			   break;

		   case Saturday:
			   System.out.println("The day is Saturday");
			   break;
			   
			   default:
				   System.out.println("Its Not in the list ...");
		}
		
			 
	}
	
}
