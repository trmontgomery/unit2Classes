
import java.util.Scanner;

public class CommaDetector
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numComma;
        
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        numComma = input.nextInt();
        
        String numString = Integer.toString(numComma);
        int numLength = numString.length();
        String fThreeDigits = numString.substring(0, numLength-3);
        System.out.println(fThreeDigits);
        String lThreeDigits = numString.substring(numLength-3, numLength);
        System.out.println(lThreeDigits);
        System.out.println(fThreeDigits + lThreeDigits);
        
    }

}
