/* In this example we are seeing how we can implement diffrent methods that are available in the FileInputStream
 * This way we can
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class FileForInputStreamExample 
{

	public static void main(String[] args) 
	{
		try 
		{
			int i=0;
			
			
			FileInputStream f2 = new FileInputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/Javainput.txt");
			
			byte [] b = new byte[20];
			
			
			System.out.println("availble bytes in file :- " +f2.available());

			i=f2.read(b, 0, 2);
			System.out.println("Number of Bytes read " +i);
			
						
			for(byte b1 : b)
			{
				char c = (char)b1;
				System.out.print(c);
				
			}
									
		
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
				

	}

}