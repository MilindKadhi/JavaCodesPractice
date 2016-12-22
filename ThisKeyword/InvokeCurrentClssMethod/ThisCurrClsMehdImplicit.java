
public class ThisCurrClsMehdImplicit 
{

	void thistry(ThisCurrClsMehdImplicit t1)
	{
		System.out.println("Method Invoked");
		
	}
	
	void thistry1()
	{
		thistry(this);
		thirsttry2(this);
	}
	
	void thirsttry2(ThisCurrClsMehdImplicit t2)
	{
		System.out.println("Method Invoked again... ");
	}
}

// This Currenct Class Method call type is used, when we have multiple Methods and we want to use this to pass argument in a method . 