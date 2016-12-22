
public class AreaCommon 
{

	// 		Here we will be seeing how we can overload Area Method by having diffrent parameters passed 
	
	
	public void area(int a) // This will calculate area of circle 
	{
		double pi=3.14;
		double b=pi*a*a;
		
		System.out.println("The area of The circle is :- " +b);
	}
	
	
	public void area(int l, int b) // This will calculate area of rectangle 
	{
		int ans=l*b;
		
		System.out.println("The area of The Rectangle is :- "+ans);
		
	}
	
	public void area(double base, double height) // This will calculate area of Triangle 
	{
		double ans2 = (base * height)/2;
		
		System.out.println("The area of The Triangle is :- "+ans2);
	}
}
