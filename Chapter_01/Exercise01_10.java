/**
 * 1.10 (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */
public class Exercise01_10 {

    public static void main(String[] args) {
        
        //Convert kilometers into miles
        double miles = 14 / 1.6;
        
        //Convert Minutes into Hour (45 minutes and 30 second = 45.5 minutes)
        double minutes = 45.5 / 60;
        
        // Calculate Average speed in miles per hour
        double speed = miles / minutes ;           

        System.out.println("The average speed in miles per hour " + speed);

    }
}