/*This class will contain the Comparision Logic On the Basis of Age
 * Logic will work as 
 * if age1 > age2 then return any positive
 * if age1 < age2 then return any negative
 * if age1 == age2 then retun 0 
 */ 

import java.util.*;
import java.lang.*;

public class StdAgeComparator implements Comparator
{
  public int compare(Object o1, Object o2)
  {
	  StdntForComparator s1 =(StdntForComparator)o1;
	  StdntForComparator s2 =(StdntForComparator)o2;
	  
	  if(s1.Age == s2.Age)
		  return 0;
	  if(s1.Age > s2.Age)
		  return 1;
	  else 
		  return -1;
	  
  }
		
}
