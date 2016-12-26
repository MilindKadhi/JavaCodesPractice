/* The comparable is a interface which is used to order the object of the user defined classes
 * it can only do Single Sorting 
 * this means u can sort eighter say the Roll num, ID, name etc ... (incase of Student Class)
 * We can Sort the Elements of 
 * String Object, Wraper class Object, User Defined class Object
 */


import java.lang.*;
import java.util.*;
import java.io.*;

public class CompareMain {

	public static void main(String[] args) 
	{
		
		ArrayList<CompareExamStudent> c1 = new ArrayList<CompareExamStudent>();
		
		c1.add(new CompareExamStudent(10, "Milind", 100, 55));
		c1.add(new CompareExamStudent(20, "Mansi", 200, 12));
		c1.add(new CompareExamStudent(5, "MMK", 80, 50));
		
		Collections.sort(c1);  // In the Following Sort we will be sorting using the Age of the Students as we can see the output.

		for(CompareExamStudent s :c1)
		{
			System.out.println("The Roll is " +s.RollNum + " The Name is : "+s.Name + " MArks is :" +s.Marks + " Age is :-"+s.Age);
		}
		
	}

}
