
import java.util.*;


public class StudentArrayListMain
{

	public static void main(String[] args) 
	{

		StudentArrayList s1 = new StudentArrayList(1, 1, "Milind", 80);
		StudentArrayList s2 = new StudentArrayList(2, 2, "Monish", 90);
		StudentArrayList s3 = new StudentArrayList(3, 3, "NIIT", 100);
		
		ArrayList<StudentArrayList> al1 = new ArrayList<StudentArrayList>();
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		
		Iterator<StudentArrayList> itr = al1.iterator();  // Here we will be using Iterator for Arraylist to control the output
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
