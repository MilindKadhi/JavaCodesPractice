import java.lang.*;
import java.util.Comparator;;

public class StudentComparator implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		Student st1=(Student)o1;
		Student st2=(Student)o2;
		
		return st1.MdName.compareTo(st2.MdName);
		
	}
}
