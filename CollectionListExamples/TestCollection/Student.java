/* This example will contain a logic 
 * where we will be storing Student and Staff Data and performing some operations on them using Collections Framework 
 * we will have Stduent Class whihc will have Rlnum, Age, Midlname . 
 * we will have Staff Class whihc will have ID,Role, Age, Name . 
 * 
 */

import java.lang.*;
import java.util.Comparator;

public class Student implements Comparable<Student>
{

	int RollNum,Age;
	String MdName;
	
	Student(int RollNum, int Age, String MdName)
	{
		this.RollNum = RollNum;
		this.Age = Age;
		this.MdName = MdName;
	}
	
	/* here we will be writing our logic for Sorting the student on basis of age 
	 * where we wll see if a1>a2 we will return 1
	 * a1<a2 retrun any nwgative 
	 * an d a1=a2 then return 0
	 */
	
	
	public int compareTo(Student s1)  // this is the method of interface Comparable which has the logic 
	{
		if(Age==s1.Age)
			return 0;
		if(Age>s1.Age)
			return 1;
		else
			return -1;
			
	}
	
	public String toString()

	{
	return RollNum + " " +Age + " " +MdName;
	
	}
	
	
}


