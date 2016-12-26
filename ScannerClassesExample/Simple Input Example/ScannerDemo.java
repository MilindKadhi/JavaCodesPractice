/* Scanner is useally used 
 * to take Input from the user via a Resource input device. 
 * in this case we are taking input using a Keyboard
 * With a example we will see how we can read multiple Data using the inbuiltScanner methods in java sd
 */

import java.util.*;

public class ScannerDemo {

	public static void main(String[] args)
	
	{
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Your Roll Number := " );
		int Roll = s1.nextInt();     // Using Next Int method we will accept any integer value and store it . 
		
		System.out.println("Enter Your Age := " );
		int Age = s1.nextInt();
		
		System.out.println("Enter Your Name :- " );
		String name = s1.next();
		
		System.out.println("Your Roll Number is : " +Roll + " ,your Age is : " +Age + " and your Name is : " +name);
				
		s1.close();

	}

}
