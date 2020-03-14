import java.util.Scanner;
public class Temperaturefinal{

	public static void main(String[]args){
	  
	double temp1;
	String temp2 = ""; 
 
	Scanner tp= new Scanner(System.in);
	System.out.println("Type temperature in celsius");
	// asks the user for temperature in C
    temp1=tp.nextDouble();
  
    System.out.println( "\nTemperature is " + temp1 + " C.");
    // prints the entered temperature in C
	  
	temp2 = (temp1 < 0) ? "cold":"hot"; 
	  // if temp less than 0 then cold else if hot
      System.out.println("\n" + temp2);
	  // prints a message based on temperature
     
  }
  
}