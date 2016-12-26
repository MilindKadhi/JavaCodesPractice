import java.lang.*;


public class CompareExamStudent implements Comparable<CompareExamStudent>

{

	int RollNum;
	String Name;
	int Marks;
	int Age;
	
	CompareExamStudent(int RollNum,String Name,int Marks, int Age)
	{
		this.RollNum = RollNum;
		this.Marks = Marks;
		this.Age = Age;
		this.Name = Name;
		
	}
	
	public int compareTo(CompareExamStudent s1) // Here we use compareTo method to Compare the Datatype in the list
	{
		if(Age==s1.Age) 	    // here we are using IfElse to check the Age of the Student and Print the list accordingly . 
		return 0;
		else if(Age>s1.Age)
	    return 1;
		else 
	    return -1;
		
	}
}
	

