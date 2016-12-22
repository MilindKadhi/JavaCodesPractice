
// In this Class we will see how we can copy the Values of One Object into another using Constructor ... 


public class CopyConst 
{

	int RollNum;
	String Name;
	
	
	CopyConst(int rn, String nm) 
	{
		RollNum=rn;
		Name=nm;
		
	}
	
	
	 CopyConst(CopyConst c1)  // this declaring a Constructor with a value of other object . 
	 {
	
		 RollNum = c1.RollNum;
		 Name = c1.Name;
	
	 }
	 
	
	 void display()
	 {
		 
		 System.out.println("The Roll num is :- " +RollNum + " And the Name is " +Name);
		 
	 }
		 
	 
}
