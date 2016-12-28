/* Enum is a data type that is used in java to define fixed values .
 * by defining anything in enum we define the fixed values of the data
 * these are static and fixed implicitly
 * enum is internally a Class 
 * enum will only accept String type values no integers 
 * it is bydefault String.
 * 
 * Now we will see what happenes if we declare Enum inside the main class and outside the class 
 * we will see how we can acess the values of the enums declared inside and outside the class ... 
 * for enum inside the main class we use Enhanced  For Loop 
 * and for enum outside the main class we use normal object declaration 
 */


 enum Season1{ cold, Hot, VeryCold, VeryHot }
 
 

public class EnumSimple 
{
	

        public enum Season { WINTER, SPRING, SUMMER, FALL } // Here we are declaring Enum by using enum keyword

        public static void main(String[] args) 
           {
	
              for (Season s : Season.values())    // we use values method which fetches values declared from enum.
              {
                 System.out.println(s);
              }
              
              
              Season1 s1 = Season1.cold;        // we will create object of Season1 and acess the specific value of Season1
              
              
              System.out.println("");
              System.out.println("");
              
             
              System.out.println("We will now print from enum which is declared outside the class  ");
              
              System.out.println(s1);

              
              
           }

}
