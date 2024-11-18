import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    //Shopping
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

    //Quote
    System.out.println("\"That brain of mine is something more than merely \n mortal; as time will show.\" \n Ada Lovelace \n The first computer programmer");

    //Rabbit
    System.out.println("(\\(\\ \n( - -) \n((') (')");

    

  }
}
