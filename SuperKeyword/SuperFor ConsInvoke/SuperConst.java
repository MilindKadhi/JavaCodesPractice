// Super Keyword is also used to call the Constructor of the Parent Class.. 
// In this example we will be able to see how can we use Super Keyword to invoke Constructor of the Parent Class

public class SuperConst 
{
	SuperConst()
	{
		System.out.println("This is a call from Main Constructor ");
	}


}

class SuperConst2 extends SuperConst
{

	SuperConst2()
	{
		super();
		System.out.println("This a Call from Sub Class");
	}
	
}