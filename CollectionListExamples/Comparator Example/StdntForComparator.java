
/* Here we will be seeing how to use the Comparator type in Collection 
 * The Comparator type is used to Order the Objects of User Defined Classes . 
 * The main diffrence in Comparator and Comparabel is that it can be used to Sort 
 * Multiple datamemners 
 * We will be taking a Example of Student and compare using the students Age and Name . 
 */


public class StdntForComparator
{
	int Age,RollNum;
	String Name;
	
	StdntForComparator(int Age,int Rollnum,String Name) // Creating a Parameterised Constructor . 
	{
		this.Age=Age;
		this.RollNum=Rollnum;
		this.Name=Name;
		
	}

	
	public String toString()
	{
		return +Age + " " +RollNum + " " +Name ;
	}
}


