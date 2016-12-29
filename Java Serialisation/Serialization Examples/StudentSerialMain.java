import java.io.*;
import java.util.*;

public class StudentSerialMain {
	
// Here we are going to see How serialization works and what are the methods important in using Serialisation 
	
	public static void main(String[] args) throws Exception
	{

		StudentSerial s1 = new StudentSerial(20, 17, "Milind");  // we Are creating an object of StudentSerial Class with values
		
		/*In the code Below we are using File output and object output so that we can write the data of the Object in
		 * the Specic file .. Note the data that is stored in the file is in Bytes 
		 * Remember we have to maintain the sequence while performing any File IO operations or else Exceptions will occur .
		 * 
		 */
		
		FileOutputStream f1 = new FileOutputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/NewTest.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		
		o1.writeObject(s1); // Here we are writing the data of s1 in the file from the object .. 
		
		
		
		/* In the code below we are using InputStream to read the data from the life which is in Object
		 * and we are typecasting it so that we can read the data in the desired format . 
		 * 
		 */
		
		FileInputStream f2 = new FileInputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/NewTest.txt");
		ObjectInputStream o2 = new ObjectInputStream(f2);
				
				
		StudentSerial st = (StudentSerial)o2.readObject();
		System.out.println(st);
		
		
		
		System.out.println("Sucess");
	}

}
