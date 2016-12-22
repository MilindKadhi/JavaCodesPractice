// Here we will see that Super method is also used to Call a Parent Class Method... Regardless where it is declared ..

public class SuperForParntMethod

{
	
	void disply()
	{
	
		System.out.println("This is from Parent Class ");
	}

}

class SuperParentExtends extends SuperForParntMethod
{
	void display()
	{
		System.out.println("This is from Sub Class ");
		super.disply();
	}
}

