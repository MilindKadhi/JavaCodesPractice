import java.util.Scanner;

public class FamilyList {
 
 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
 
		
		System.out.print("Enter how many FamilyMembers : ");
		
		int FamilyMembers = Integer.parseInt(scan.nextLine());
 
		
		String arrayOfNames[] = new String[FamilyMembers];
		
		for (int i = 0; i < arrayOfNames.length; i++) 
		{
			System.out.print("Enter the name of Family Member  : ");
			
		    arrayOfNames[i] = scan.nextLine();
		}
		    
		
		for (int i = 0; i < arrayOfNames.length; i++) 
		{
			System.out.print("My Family member  ");
		        System.out.print(arrayOfNames[i] + "\n");
		}
		  
 
		    
 
	}
 
}
 