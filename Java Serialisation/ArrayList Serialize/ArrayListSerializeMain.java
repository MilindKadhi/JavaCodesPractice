/* in the below example we will see how can we 
 * serialise using a Array list . 
 * We have  not implemented the Serializable interface in the below class because
 *  ArrayList is already been serialized by default.
 */


import java.io.*;
import java.util.ArrayList;

public class ArrayListSerializeMain 
{

	public static void main(String[] args) throws Exception
	{
		
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		
		
		a.add("Milind");
		a.add(14);
		a.add("Kadhi");
		a.add("Mansi");
		a.add(15);
		a.add("Kadhi");
		
		try
		{
			FileOutputStream fo = new FileOutputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/Array.txt");
			ObjectOutputStream o1 = new ObjectOutputStream(fo);
			
			o1.writeObject(a);
			System.out.println("Sucess");
			
			FileInputStream f1 = new FileInputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/Array.txt");
			ObjectInputStream o2 = new ObjectInputStream(f1);
			
			b=(ArrayList)o2.readObject();
			System.out.println("Printing From ArrayList " +b);
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		
	}

}
