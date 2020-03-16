import java.util.Scanner;
public class Bmifinal {

    public static void main(String[] args) {
     
    Scanner wg= new Scanner(System.in);
    System.out.println("Type your weight in pounds");
    double weight = wg.nextDouble();
    // asks the user for weight in pounds
    Scanner h=new Scanner(System.in);
    System.out.println("Type your height in feet");
    double height = h.nextDouble();
    // asks the user for height in pounds

    double meters=0.3048*height;
    // converts pounds to m
    double kg=0.453592*weight;
    // converts feet to kg
    double bmi= Math.round(kg/(meters*meters));
    // calculates bmi
    System.out.println("your BMI is "+bmi);
    //prints bmi
    if (bmi < 18.5){
    System.out.println("\nYou are underweight");
    } else if (bmi< 25) {
    System.out.println("\nYou are normal");
    } else if (bmi< 30) {
    System.out.println("\nYou are overweight");
    } else {
    System.out.println("\nYou are obese");
    }
    // prints bmi classification based on bmi
         	   
    }
}
