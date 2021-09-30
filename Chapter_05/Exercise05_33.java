package Exercise05;
/**
 * ** 5.33 (Current date and time) Invoking System.currentTimeMillis() returns the
 * elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 * that displays the date and time. Here is a sample run:
 * Current date and time is May 16, 2012 10:34:23
 * @author Taufik Mansuri 
 * ID 20CS032
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise05_33 {
   public static void main(String[] args) {
    
        long millis = System.currentTimeMillis();
        Date date = new Date(millis) ; 
        String mydateFormat = "MMM dd, yyyy  hh:mm:ss "; //date output format in given program
        SimpleDateFormat sdf = new SimpleDateFormat(mydateFormat); 
        System.out.println("Current date and time is " + sdf.format(date)); //print output date format
    }
}