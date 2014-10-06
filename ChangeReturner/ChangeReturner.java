import java.util.Scanner;

public class ChangeReturner
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      int amount;
      int change;

      System.out.print ("Enter the the amount due: ");
      amount = s.nextInt();

      System.out.print ("Enter the amount recieved by the customer: ");
      change = s.nextInt();
