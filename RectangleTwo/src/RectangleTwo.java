
import java.util.Scanner;

/*
Cameron Chromiak
25 Sept
area and peimeter of rectangle
 */

/**
 *
 * @author cchromia
 */
public class RectangleTwo {

   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length:");
    double length = i1nput.nextDouble();
    System.out.println("Enter the width:");
    double width = input.nextDouble();

    double area = length * width;
    double perimeter = length * 2 + width * 2;
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter); 
  }
  
}
