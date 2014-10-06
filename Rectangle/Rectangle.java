import java.util.Scanner;

public class Rectangle
{
   public static void main (String[] args)
   {
      Scanner s = new Scanner(System.in);
      double length, width;
        
      System.out.print ("Enter the length: ");
      length = s.nextDouble();

      System.out.print ("Enter the width: ");
      width = s.nextDouble();
      
      double area = (length*width);
      double perimeter = (length+length+width+width);
      
      System.out.println("The area is " + area);
      System.out.println("The perimeter is " + perimeter);
      
      double diagonal = Math.sqrt(((length*length)+(width*width)));
      System.out.println("The length of the diagonal is " + diagonal);
    }
}

     