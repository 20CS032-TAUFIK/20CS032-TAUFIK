import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * @author Taufik Mansuri
 * @Email  20cs032@charusat.edu.in
*/
/*
-----------------------------------PROGRAM DETAILS-----------------------------------
 * 2.12 (Physics: finding runway length) Given an airplane's acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula: length =v*v/2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the 
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway length.
 */
public class Exercise02_12 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter speed and acceleration: ");
        
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length =(speed*speed) / (2 * acceleration);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        
        System.out.println( "The minimum runway length for this airplane is " +df.format(length) );
    }
}
