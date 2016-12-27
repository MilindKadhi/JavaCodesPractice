/*Exception Handling is very important concept in java that helps a programer to run and execute codes
 * handling Run time erors and exceptions . 
 * we have four important concpets 
 * Try , catch, throw , throws , finally.
 * we will see them with examples
 */

import java.util.*;

public class SimpleTryCatch {

	public static void main(String[] args) 
	{
		int number1,number2 ;
		double result;
		
		Scanner s1 = new Scanner(System.in);
		
/* we are puting our entire code in try block so that we can run the rest of code even if there is exception ... 
A try block is always ended using a Cathc method where we have declared the type of exceptions that might occur.. 
we are declaring Multiple Exceptions in the Catch Block which will return the type of exception. 
*/
		
		try 
		{
		
			System.out.println("Enter first number :-" );
			number1=s1.nextInt();
			
			System.out.println("Enter the second number :-" );
			number2=s1.nextInt();
			
			result = number1/number2;
			System.out.println("The Reult after Division is :- "+result);
		}
		catch(ArithmeticException|InputMismatchException e)
		{
			System.out.println("Invalid Input ");
			System.out.println("End of Code .....");
		}
		
		System.out.println("Hello World .....");
	}

}
