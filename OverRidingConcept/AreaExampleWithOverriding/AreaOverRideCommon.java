
public class AreaOverRideCommon 
{
	
	
	void Area()
	{
		
	}
}

class Circle extends AreaOverRideCommon
{
	void Area()
	{
		double r=4;
		double pi=3.14;
		System.out.println("The Area of Circle is :" +(pi * r * r));
		
		
	}
}

class Rectangle extends AreaOverRideCommon
{
	
	void Area()
	{
		int l =4;
		int b =5;
		int are = l*b;
		System.out.println("The Area of Rectangle is :- " +are);
		
	}
}
