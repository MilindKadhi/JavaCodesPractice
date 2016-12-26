
/* This is the main Class which will be having the logic whih will be used 
 * to Print the Object Values in sorted format. 
 * 
 */

import java.util.*;
import java.io.*;

public class StdntForComparatorMain
{

	public static void main(String ag[])
	{
		ArrayList a1 = new ArrayList();
		a1.add(new StdntForComparator(15, 10, "Milind"));
		a1.add(new StdntForComparator(12, 40, "Mansi"));
		a1.add(new StdntForComparator(2, 100, "Abc"));
		a1.add(new StdntForComparator(40, 13, "A"));
		
		
	/*	Iterator i1 = a1.iterator();
				while(i1.hasNext())
				{
					System.out.println(i1.next());
					System.out.println(a1);
				}
		*/
		
		System.out.println("We will see the Array after sorting by Name ");
		System.out.println("");
		

			Collections.sort(a1,new StdNameComparator());
		
			Iterator i1 = a1.iterator();
			while(i1.hasNext())
			{
				StdntForComparator sc = (StdntForComparator)i1.next();
				System.out.println(sc.Age + " " +sc.RollNum + " " +sc.Name);
			}
	
			
			System.out.println("");
			System.out.println("We will see the Array after sorting by Age ");
			System.out.println("");

		
			Collections.sort(a1, new StdAgeComparator());
			
			Iterator i2 = a1.iterator();
			
			while(i2.hasNext())
			{
				
				StdntForComparator sa =(StdntForComparator)i2.next();
				System.out.println(sa.Age + " " +sa.RollNum + " " +sa.Name);
			}
			
			
				
			
					
	

}
	
}
