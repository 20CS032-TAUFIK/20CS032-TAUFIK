/*
 * 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise01_12 {
    public static void main(String[] args) {
        double miles = 24;
        double hour = 1;
        double minutes = 40;
        double seconds = 35;
        double kilometer = miles * 1.6;
        double totalhour = hour  + (minutes/60) + (seconds/(60*60));
        double speed =  kilometer / totalhour;

        System.out.println("Average speed in kilometers per hour "+speed);
 
    }
