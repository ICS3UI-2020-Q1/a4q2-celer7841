/**
 *
 * @author 
 */
 import java.util.Scanner;
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int number = 1;
    while(number > 0) {

      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      number = sc.nextInt();
    }

     }
}
