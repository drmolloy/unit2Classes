import java.util.Scanner;

public class CommaRemover
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        String number;
    
        System.out.print("Enter a number between 1,000 and 999,999: ");
        number = s.next();
        char start = number.charAt(",");
        String sub = number.substring(0, start);
        String sub2 = number.substring(start,7);
        System.out.println(sub+sub2);
    }
}
