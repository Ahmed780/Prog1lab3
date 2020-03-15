import java.util.*;
public class EmailAddress {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print(" Enter a word: " );
    String word = input.nextLine();

    if (word.contains('@')) {
    System.out.println("It's an Email");
    }
    else {
    System.out.println("It's not an Email");
    }

  }
}
