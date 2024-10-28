import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println ("What type of item are you buying?");
    String x = userInput.nextLine();
    System.out.println(x);
    System.out.println("How many are you buying?");
    Integer y = userInput.nextInt();
    System.out.println(y);
    System.out.println ("How much does one weigh?");
    Double z = userInput.nextDouble();
    System.out.println(z);
    System.out.println(y + " " + x + " at " + z + " pounds each will weigh " + (y*z) + " pounds total");


    

  }
}
