
/*Java Serialization is a Concept in Java which is used when we wnat to write the objects data in a file .. 
 * it is mainly used in EJB, Hybernate Technoogies . 
 * It is mainly used to travel the object state on a network whihc is knwn as marshlling . 
 * For allwing the Serialization concept to run we need to implement the Serializable class.. 
 * it has to be implemented in the class whose object we want to Serialise . 
 */


import java.io.*;

public class StudentSerial implements Serializable
{

	int RollNum,Age;
	String Name;
	
	StudentSerial(int RollNum, int Age, String Name)
	{
		this.RollNum = RollNum;
		this.Age = Age;
		this.Name =Name;
	}

	
	public String toString() 
	{
		return " RollNum=" + RollNum + ", Age=" + Age + ", Name=" + Name ;
		
	}
	
	
}
