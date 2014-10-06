import java.util.Scanner;

public class PhoneNumberConverter
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        String number;
        
        System.out.print("Enter the phone number: ");
        number = s.next();
        
        String sub1 = number.substring(0,3);
        String sub2 = number.substring(3,6);
        String sub3 = number.substring(6,10);
        System.out.println("("+sub1+")"+sub2+"-"+sub3);
    }
}
        