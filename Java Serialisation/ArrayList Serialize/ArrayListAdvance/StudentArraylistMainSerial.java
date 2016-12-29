package ArrayListAdvance;
import java.io.*;
import java.util.*;

public class StudentArraylistMainSerial 
{

	public static void main(String[] args) throws Exception
	{

		StudentArrayList s1 = new StudentArrayList(1, 2, "Mk");
		StudentArrayList s2 = new StudentArrayList(2, 3, "MMK");
		StudentArrayList s3 = new StudentArrayList(4, 5, "JJK");
		StudentArrayList s4 = new StudentArrayList(7, 9, "NNK");
		
		ArrayList<StudentArrayList> a1= new ArrayList();
		ArrayList b = new ArrayList();
		
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		FileOutputStream f1 = new FileOutputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/MultipleArrayList");
		ObjectOutputStream f2 = new ObjectOutputStream(f1);
		
		f2.writeObject(a1);
		System.out.println("Sucess");
		
		FileInputStream f3 = new FileInputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/MultipleArrayList");
		ObjectInputStream f4 = new ObjectInputStream(f3);
		
		b= (ArrayList)f4.readObject();
		
		System.out.println(b);
		
		
		
		
	}

}
