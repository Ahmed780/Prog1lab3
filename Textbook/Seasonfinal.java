import java.util.*;

public class Seasonfinal {

  public static void main(String[] args) {

  double celsius;

  Scanner temp = new Scanner(System.in);

  System.out.println("\nPlease enter a whole number");
  celsius = temp.nextDouble();

  if(celsius > 110 || celsius < -5) {
    System.out.println("\nNot valid");
	}
  else if(celsius >= 90 ) {
    System.out.println("\nSummer");
  }
  else if(celsius >= 70 & celsius < 90) {
    System.out.println("\nSpring");
  }
	else if(celsius >= 50 & celsius < 70) {
    System.out.println("\nFall");
  }
	else if(celsius < 50) {
    System.out.println("\nWinter");
  }

  }

}
