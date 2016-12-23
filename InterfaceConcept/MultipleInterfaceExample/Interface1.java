// In this example we will see how we can implement Multiple Interfaces in one class


public interface Interface1 
{
	void call1();
	

}
 interface Interface2
 {
	 void call2();
	 
 }
 
 interface Interface3
 {
	 void call3();
	 
 }
 
 class InterfaceImple implements Interface1,Interface2,Interface3
 {
	 public void call1()
	 {
		 System.out.println("This is call 1 from Interface1");
	 }
	 
	 public void call2()
	 {
		 System.out.println("This is call 2 from Interface2");
	 }
	 
	 public void call3()
	 {
		 System.out.println("This is call 3 from Interface3");
	 }
 }