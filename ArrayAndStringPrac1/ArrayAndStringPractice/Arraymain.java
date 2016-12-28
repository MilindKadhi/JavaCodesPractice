
import java.util.Arrays;

//import javax.naming.ldap.SortControl;
// import javax.swing.SortingFocusTraversalPolicy;

public class Arraymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		  
		  //defining String type variable and will perform some string operations on the same 
		  
		  String string1 = "hello";
		  String string2= " World , ";
		  String string3= "";
		  String string4="";
		  String string5= "I Love Java" ;
		  String string6;
		  
		  // ----------------------------------------------------------------------------------------------//
		  // ----------------------------------------------------------------------------------------------//
		  
		  
		  //  								 Now we wConcatinate operation
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Concartination of string   ");
		  
		  
		  string3 = string1 + string2 + string4 + string5;
		  
		  System.out.println("The new string After Concatination is :- " +string3);
		  
		  

		  //      						Alternate way of Concatination is as follows 
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Concatination using alternate method");
		  
		  
		  string6="And all i want to say is ".concat(string5); // using the concate function for concatination
		  
		  System.out.println("After using Concatination function the output is :- "+string6);
		  
		  
		  
		  
		  
		   
		  
		  // ----------------------------------------------------------------------------------------------//
		  // ----------------------------------------------------------------------------------------------//
		  
		  
		  //							Now we will perform Length Operations 
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Length of string Example  ");
		  
		  
		  System.out.println("The Length of the the String Hello is  :- " +string1.length()); 
		  
		  // The length Function returns the lenght of the selected string in this case string1 
		                                                                     
		  
		  // ----------------------------------------------------------------------------------------------//
		  // ----------------------------------------------------------------------------------------------//
		  
		  
		  
		 //								Now we will perform Substring Operation  
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Substring Example  ");
		  
		  
		  System.out.println("The Substring of the Hello is  :- " +string1.substring(0, 4)); 
		  
		  //The Substring function fetches the Characters between the defined value in our case char from 0 to 4 will be displayed
		  
		  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------//
		  
		  
		//							Now we will perform ToUppercase Operation 
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Upeercase Example  ");
		  
		  
		  System.out.println("The Upper Case of hello is :- " +string1.toUpperCase());
		  
		  // The toUppercase will convert all the characters in the Selected string to Uppercase and display
		
		  
		  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------//
		  
		
		  
		//					 Now we will work on Array   
		  
		 // Single Dimentional array  
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Single Dimentional of Array Example  ");
		  
		  int a[]= new int[5];  // we are now declaring a Int array and instantiating it 
		  
		  
		  a[0]=3;
		  a[1]=4;
		  a[2]=6;
		  a[3]=7;
		  a[4]=8;
		  
		  // We will print the Array using For loop 
		  
		  for(int i =0;i<a.length;i++)
		  {
			  System.out.println("The Array list is  :-" +a[i]);
		  }
				  
		
		  // alternate way of declaration and instantiating array is 
		  
		  System.out.println("");
		  System.out.println("");
		  
		  int b[]={1,2,3,4,5};
		  
		  for(int i=0;i<b.length;i++)
		  {
			  System.out.println(b[i]);
		  }
		  
		// ----------------------------------------------------------------------------------------------//
	   // ----------------------------------------------------------------------------------------------//	  
		  
		 
		  // Now we will See how we can Pass an Array to a Method so that we can Reuse it on any array
		  
		  // We will take an Eample of Finding the MINIMUM of the array list 
		  
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Minimum of Array Example  ");
		  System.out.println("");
		  
		  
		  
		  Minimum m =new Minimum();       // here we are creating a object of class Minimum 
		  
		  int arr[]={45,33,22,11}; 		 // declaring list of array 
		  
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
			  
		  }
		  
		  
		  m.minofarray(arr);  			//caling the function of class Minimum and comparing the array declared in main class
		  
				  
				  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------//
		  
		  
		  
		  // 					Now we will See MULTI DIMENTIONAL ARRAY   
		  
		  System.out.println("");
		  System.out.println("");
		 
		  System.out.println("Multi Dimentional Array Example ");
		  System.out.println("");
		  
		  
		  int a1[][]={{1,2},{4,5},{9,10}};  // Declaration of the MultiDimentional Array 
		  
		  // Now we will see how can we print the above List 
		  
		  for (int x=0;x<3;x++)
		  {
			  for(int y=0;y<2;y++)
			  {
				  System.out.println(a1[x][y] +" ");
			  }
			  
			  System.out.println();
		  }
		  
		  
		  
		  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------//
		  
		  
		
	     //  			Now we will See Addition of Two Matrices   
		  
		  
		  System.out.println("");
		  System.out.println("");
		 
		  System.out.println("Addition of Multi Dimentional Array Example ");
		  System.out.println("");
		  
		  // first we shall create two matrices 
		  
		  int arr1[][]={{1,2,3},{4,5,6}};
		  int arr2[][]={{3,3,3},{3,3,3}};
		  
		  // now we will create a matrice which will hold the value of the addition 
		  
		  int arr3[][]=new int[2][3];
		  
		  for(int i=0;i<2;i++)
		  	{  
			  for(int j=0;j<3;j++)
			   {  
			 
				  arr3[i][j]=arr1[i][j]+arr2[i][j];  
			  
				  System.out.print(arr3[i][j]+" ");  
			   }
			  
			    System.out.println();  
			  
			  } 
		  
		  
		  
		  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------//
		  
		  
		  // Now we will Do Sorting in Array on Three Dimensional Array .. in Ascending
		  
		  System.out.println("");
		  System.out.println("");
		 
		  System.out.println("Sorting of Arrays ");
		  System.out.println("");
		  
		  //  		Here we will be using Array inbulit function to Sort in Acsending order
		  // 		We will also see alternate method for the same ... 
		  
		  
		  int srt[]={2,1,4,3,6};
		  
		  
		  System.out.println("The array is as follows");
		  for(int ary=0;ary<srt.length;ary++)
		  {
			  System.out.println(srt[ary]);
			  
		  }
		  
		  System.out.println("");
		  System.out.println("The sorted Array in ascending order is ");
		  
		  Arrays.sort(srt);
		  
		  for(int p:srt)
		  {
			  System.out.println(p);
		  }
		  
		  
		  // Now We will see Altenative method Using Logic for The same but will perform Descending Sorting 
		  
		  System.out.println("");
		  System.out.println("Sorting the Array in Descending order ");
		  
		  
		  
		  int Desc[] = new int[]{5,90,35,45,150,3};
		  System.out.println("Array before Sorting ");
		  for(int p:Desc)
		  {
			  System.out.println(p);
		  }
		  
		  Descending d = new Descending();
		  d.Sorting(Desc);
		  
		  System.out.println("Array After Sorting");
          for(int i=0; i < Desc.length; i++)
          {
                  System.out.print(Desc[i] + " ");
          }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		// ----------------------------------------------------------------------------------------------//
		// ----------------------------------------------------------------------------------------------// 
		  
		  
		  
		  
		
	}

}
