
public class BankOverRidingMain {

	public static void main(String[] args) 
	{

		ICICI i = new ICICI();
		SBI s = new SBI();
		
		System.out.println("The ROI of ICICI is " +i.ROI());	
		System.out.println("The ROI of SBI is "+s.ROI());
		
	}

}
