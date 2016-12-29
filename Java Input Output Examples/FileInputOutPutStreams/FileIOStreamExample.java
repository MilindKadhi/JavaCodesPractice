/* The Java OutPut Stream is used to Write the Data in a Specific File 
 * 
 * Some Methods in Output Stream are 
 * 
protected void finalize()					usued to clean up the connection with the file output stream.

void write(byte[] ary)						used to write ary.length bytes from the byte array to the file output stream.

void write(byte[] ary, int off, int len)	used to write len bytes from the byte array starting at offset off to the file op

void write(int b)							used to write the specified byte to the file output stream.

FileChannel getChannel()					used to return the file channel object associated with the file output stream.

FileDescriptor getFD()						used to return the file descriptor associated with the stream.

void close()								Iused to closes the file output stream.

 */


import java.io.*;

public class FileIOStreamExample{

	public static void main(String[] args) 
	{

		try
		{
			FileOutputStream fo = new FileOutputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/JavaTest.text"); 
			
			/*The Above Statement we are using Output stream 
			 * so that if the file JavaTest.txt does not exist it will create it in the location and then print the Content
			 * and if the Given File Exists than it will write the given content in the file . 
			 * 
			 */
			
			String s = "Test1 in File Java in Milind Kadhi ";
						
			byte b[]=s.getBytes();
			
			fo.write(b);
			fo.close();
			
			
			
			FileInputStream fi = new FileInputStream("/Users/milindkadhi/Desktop/My Files/JavaPrac/JavaTest.text");
			
			/* We take File Input Stream when ever we want to read a Specific File
			 * we have various methods that are used in case of File Input Stream . 
			 */
			
			     int i=0;
				System.out.println("The Contents of the File are as below ...");
				System.out.println("");
				
				while ((i=fi.read())!=-1)  // using a While Loop we will be checking till when we have to read from file
					{
					    
						System.out.print((char)i);
						
								
					}
				
				System.out.println("");
			    System.out.println("Sucessfully Done");
			    
			    
			
		}
		
			catch (Exception e) 
			{
					System.out.println(e);		
			}
		
	}

	}
