package CustomException;

import java.util.*;
import java.util.Scanner;

public class CustomExample {

	public static void main(String[] args) throws InvalidAgeException,InvalidNameException
	{
		
Scanner s1 = new Scanner(System.in);
		
		int age;
		String Name;
		
		System.out.println("Enter Age :- " );
		age = s1.nextInt();
		
		
		
		if(age<10) 
		{
			throw new InvalidAgeException();
				
			
		}
		
			
		System.out.println("Enter Name :- " );
		Name = s1.next();
		
			 if(Name.equals("Milind"))
			 {
				 	throw new InvalidNameException();
			
			 }
		
		
		
		System.out.println("The Age is :-" +age);
		System.out.println("The Name is :- "+Name);
		
		
	}
	}

