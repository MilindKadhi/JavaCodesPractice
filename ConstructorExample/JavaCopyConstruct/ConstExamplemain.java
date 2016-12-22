
public class ConstExamplemain {

	public static void main(String[] args) 
	
	{
	
		// The Objects c1 and c2 shows example of Copywith Constructor
		
		CopyConst c1 = new CopyConst(3, "MJK");
		CopyConst c2 = new CopyConst(c1);
		
		c1.display();
		c2.display();

		System.out.println("");
		
		// The Objects c3 and c4 shows Example of Copy Without Constructor 
		
		CopyConstWithout c3 =new CopyConstWithout(4, "JJK");
		CopyConstWithout c4 =new CopyConstWithout();
		
		c4.RollNum = c3.RollNum;
		c4.Name = c3.Name;
		
		c3.Display();
		c4.Display();
		

	
	}

}
