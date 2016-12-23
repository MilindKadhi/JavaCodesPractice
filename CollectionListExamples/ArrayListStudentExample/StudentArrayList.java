import java.util.Iterator;

public class StudentArrayList
{

	int RollNum,Std;
	String Name;
	int Percent;
	
	StudentArrayList(int RollNum, int Std, String Name, int Percent)
	{
		this.RollNum = RollNum;
		this.Std = Std;
		this.Name = Name;
		this.Percent = Percent;
		
	}
	
	public String toString()
	{
		return RollNum + " " + Name + " " + Std + " " + Percent ;
		
	}
	
	
	
}
