// Here we are creating a Base class whcih has a ROI method which will be Extended and overridden by the Subcalsses 
// in the Main class we will see how the output will diffrer when obj of various classes are called.. 


public class BankOverRiding 
{

	 int ROI()
	{
		return 0;
	}
}


class ICICI extends BankOverRiding // ICICI extending BankOverRiding and overriding ROI 
{
	int ROI()
	{
		return 2;
	}
}


class SBI extends BankOverRiding  //SBI extending BankOverRiding and overriding ROI 
{
	int ROI(){
		return 3;
	}
}