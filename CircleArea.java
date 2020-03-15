import java.util.Scanner;
public class CircleArea{

	public static void main(String[]args)  {
	
    Scanner circle = new Scanner(System.in);

    System.out.println("\nEnter the radius of circle");
    double radius = circle.nextDouble();

    double area = Math.round (Math.PI * (radius * radius));

    if (radius > 0) {
    System.out.println("\nArea of circle is "+area);
    }
    else if ((radius == 0) || (radius < 0)) {
    System.out.println("invalid radius");
  }
}
}