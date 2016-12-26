/* In this Class we will be Writing th logic for comparing the string in the User Defined Class 
 * here we will use the following type 
 * we will use the compareTo method of string which has a internal logic for Comparision of String . 
 */



import java.util.*;

public class StdNameComparator implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		StdntForComparator s1=(StdntForComparator)o1;
		StdntForComparator s2=(StdntForComparator)o2;
		
		return s1.Name.compareTo(s2.Name);
		
	}
}
