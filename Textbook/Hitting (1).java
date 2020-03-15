import java.util.*;
public class Hitting {
 
	public static void main(String[] args) {

    	double hit;
    	double hit2;
    	double avg;

    	Scanner temp = new Scanner(System.in);
    	System.out.println("\nPlease enter number of hits/runs");
    	hit = temp.nextDouble();
    
    	System.out.println("\nPlease enter number of at-bats/balls faced");
    	hit2 = temp.nextDouble();

    	avg = hit * 100 / hit2 ;
    	System.out.println("your batting average is "+ avg);

    	if(avg > 300) {
    	System.out.println("\nyou are eligible");
	}
    	else if(avg < 300 ) {
    	System.out.println("\nyou are not eligible");
    	}

  }
}
