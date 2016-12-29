package ArrayListAdvance;
import java.io.*;

public class StudentArrayList  implements Serializable
{

	int rn,ag;
	String nm;
	
	 StudentArrayList(int rn, int ag, String nm)
	 {
		 this.ag=ag;
		 this.nm=nm;
		 this.rn=rn;
		 
	 }

	@Override
	public String toString() {
		return "rn=" + rn + ", ag=" + ag + ", nm=" + nm ;
	}
	 
	 
}
