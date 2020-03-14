import java.util.*;

public class Match {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("\nPlease enter your password" );
  	String password = input.next();

  	System.out.println("\nPlease enter your password again" );
  	String password2 = input.next();

    if(password.equals(password2)) {
    System.out.println("\nYou are now registered as a new user");
    }
    else {
    System.out.println("\nSorry, there is a typo in your password");
    }

  }
}
