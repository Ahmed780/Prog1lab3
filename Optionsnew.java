

import java.util.Scanner;


public class Options {
  
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String option = "";
		
        int choice;        
                
        System.out.println("Please select one of the options below");
        System.out.println("\n(1)meter to feet");
        System.out.println("(2)CAD to USD");
        System.out.println("(3)Celsius to Fahrenheit");
        System.out.println("(4) BMI");
        System.out.println("(5)Time");
        
        choice = sc.nextInt();
         
        switch (choice) {
             
        	// m to feet
			case 1:  
			
				System.out.println ("Enter distance in meter: ");
				option = sc.next();
				double meters = Integer.parseInt(option1)*3.280;
				System.out.println (option + " m is " + meters + " feet ");
				break;

			// Currency converter	
			case 2:  
		
				final double factor = 0.75;
				double currencyEUR;
				final double factor2 = 0.60;
				System.out.println("Enter an amount in CAD");
				option = sc.next();
		    	
		    	double currencyUSD = factor * Integer.parseInt(option1);
				currencyEUR = factor2 * Integer.parseInt(option1);
				System.out.println( option + " CAD is equal to " + currencyUSD + " USD.");
				break;	
				
			// Celsius to Fahrenheit
		    case 3:  
		    		

				System.out.println("Type temperature for day 1 ");
				option=sc.next();
				System.out.println( "\nAvg temp is " + option + " C.");	
		        break;

			// BMI
			case 4:  
			

		        System.out.println("Type your weight in pounds");
		        double weight = sc.nextDouble();

		        Scanner h=new Scanner(System.in);
		        System.out.println("Type your height in feet");
		        double height = h.nextDouble();

				double m=0.3048*height;
				double kg=0.453592*weight;
		        double bmi= Math.round(kg/(m*m));
			    System.out.println("your BMI is "+bmi);
		        break;

			// Time 
			case 5:  option = "Time";  

		        System.out.println("Type time in sec");
				int seconds = sc.nextInt(); 
		        int mins = seconds / 60;
		        int secs = seconds % 60;
				System.out.println(+ mins + ":" + secs);
		        break;     
		
		}        
      
	}
    
}
