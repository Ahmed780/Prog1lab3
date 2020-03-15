import java.util.*;
public class Websitefinal {
  
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an URL links" );
    String word = input.nextLine();

    if (word.contains("gov")) {
    System.out.println("\nit is a government web address");
    }
    else if (word.contains("edu")) {
    System.out.println("\nit is a university web address");
    }
    else if (word.contains("com")) {
    System.out.println("\nit is a business web address");
    }
    else if (word.contains("org")) {
    System.out.println("\nit is an organization web address");
    }
    else {
    System.out.println("\nit is a web address for another entity");
    }

  }
}
