
public class ThisInvkClassConstructor 
{
	int RollNum;
	String Name;
	
	 ThisInvkClassConstructor() 
	 {
		
		 System.out.println("The default Constructor is Invoked ");
		 
	 }
	 
	 ThisInvkClassConstructor(int RollNum, String Name)
	 {
		 this();
		 this.RollNum=RollNum;
		 this.Name=Name;
	 }
	 
	 void Display()
	 {
		 System.out.println("The RollNumber is :-" +RollNum + " and Name is :-"+Name);
	 }

}
// Here we are using This method to invoke Current Class Constructor... which means whenever the obj is created
//this() invokes the Constructor of the class..
