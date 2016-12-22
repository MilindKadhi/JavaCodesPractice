
public class InstanceThisVariable 
{

	int RollNum;
	String Name;
	
	 InstanceThisVariable(int RollNum,String Name)
	 {
		 
		 this.RollNum =RollNum;
		 this.Name =Name;
		 
	 }
	 
	 void Display()
	 {
		 System.out.println("The RollNumber is " +RollNum + " and the Name is  :- "+Name);
	 }
}


// Here we are using This Keyword which helps us to point to Current Instance Variable and resolved the problem 
// of Ambiguity ...

// This keyword is only useful when the Parameters and the instance variables are same ... 


