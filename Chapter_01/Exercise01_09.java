/*
(Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
	area = width * height
*/
public class Exercise01_09 {
	public static void main(String[] args) {
            
            double width = 4.5;
            double height = 7.9;
        
        // Using Formula to find perimeter and area       
        double perimeter = 2 * (width + height);
        double area = width * height;
        
        System.out.println("Perimeter = " + perimeter);	
	    System.out.println("Area = " + area);			
	}
}