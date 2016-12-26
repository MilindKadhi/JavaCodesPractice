import java.util.*;
import java.lang.*;
import java.io.*;


public class StudentMain
{

	public static void main(String[] args)
	{

		ArrayList<Student> a1 = new ArrayList<Student>(); // We are Creating a Arraylist of type Student. 
		
		a1.add(new Student(10, 12, "A"));
		a1.add(new Student(8, 4, "Z"));
		a1.add(new Student(11, 18, "C"));
		
		System.out.println("The List of Student before Sorting is ");
		System.out.println("");
		
		Iterator i1 = a1.iterator();
				while(i1.hasNext())
				{
					Student st1 = (Student)i1.next();
					System.out.println("The Age is :" +st1.Age + " The Roll is :-" +st1.RollNum + " The MiddleName is : " +st1.MdName);
				}
		
		System.out.println("");
		
		/* Now we have created a Arraylist of type Student where we are creating three students and now
		 * we will perform the following operations . 
		 * Compare on basis of age 
		 */
		
		System.out.println("The List of Students after Sorting using their age is :");
		System.out.println("");
		
		Collections.sort(a1);
		for(Student s: a1)
		{
			
			System.out.println("The Age is :" +s.Age + " The Roll is :-" +s.RollNum + " The MiddleName is : " +s.MdName);
		}
		
		System.out.println("");
		System.out.println(" The List of Students after Sorting using Middle name is ");
		System.out.println("");
		
		Collections.sort(a1,new StudentComparator());
		Iterator i2 = a1.iterator();
		while(i2.hasNext())
		{
			Student sc = (Student)i2.next();
			System.out.println(" The Roll Number is :-" +sc.RollNum + " The Age is :- " +sc.Age + " The Middle Name is " +sc.MdName);
		}
		
		
	}

}
