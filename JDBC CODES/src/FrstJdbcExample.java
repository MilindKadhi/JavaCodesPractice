/* JDBC is used when we want to acess any Database and Edit or read data from the databasse.
 * This concept is very important when we are making a Java application and we have to deal with databases
 * we can use databases like sql, h2, Mysql etc in java .. all we need is to add a Jar file in the properties of our project . 
 * for our examples we are going to use H2 database which is a free download 
 */

import java.sql.*;

public class FrstJdbcExample {

	public static void main(String[] args) throws Exception
	{

		try
		{
			Class.forName("org.h2.Driver");  // this is used to Provide the Database driver so that we can access the Database 
			
			/* The below statement creates a Connecttions object which will help to execute sql statements
			 * and coneect to your database. 
			 * The getconnection method has three parts Part1:- your db url Part 2 :- username (if u have given)
			 * part3 :- is the password (if u have given)
			 * 
			 */
			Connection con = DriverManager.getConnection("jdbc:h2:~/test","user","user");
			
			
			/*The below statement creats a Statement object 
			 * which helps to create sql statements 
			 * ResultSet object helps to execute sql queries from the selected Table
			 */
			
			Statement st = con.createStatement();  
			ResultSet rs = st.executeQuery("Select * from CUSTOMERS");
			
			con.close();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
