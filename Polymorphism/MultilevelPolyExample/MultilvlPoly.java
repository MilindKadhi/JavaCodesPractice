
// Multilevel Polymerphism means that we can perform Multiple Task using the same Method .. 
// we can override the same method and make it do its diffrent task . 

 class MultilvlPoly 
{

	void Display()
	{
		System.out.println("Dog Waking ");
	}
	
}


class MultiPoly1 extends MultilvlPoly
{
	void Display()
	{
		System.out.println("Dog Eating");
	}
} 


class Multipoly2 extends MultiPoly1
{
   void Display()
   {
	 System.out.println("Dog Drinking");   
   }
}

class Multipoly3 extends Multipoly2
{
	void Display()
	{
		System.out.println("Dog Sleeping");
	}
}