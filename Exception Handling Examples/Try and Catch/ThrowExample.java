/* A Throw keyword is used when we want to execute a user defined 
 * Exception
 * We will use throw keyword in that case 
 */

import java.util.*;

public class ThrowExample {

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
		int age;
		String Name;
		
		System.out.println("Enter Age :- " );
		age = s1.nextInt();
		
		if(age<10)
		{
			throw new ArithmeticException("Invalid Age input");
			
		}
		
		
			
		
		System.out.println("Enter Name :- " );
		Name = s1.next();
		
			 if(Name.equals("Milind"))
			 {
				 	throw new InputMismatchException("Invalid Input");
			
			 }
		
		
		
		System.out.println("The Age is :-" +age);
		System.out.println("The Name is :- "+Name);
		
		
	}

}
