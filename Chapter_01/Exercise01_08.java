/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
		perimeter = 2 * radius * 3.14159
		area = radius * radius * 3.14159
*/
public class Exercise01_08 {
	public static void main(String[] args) {
		
		double radius = 5.5;
		
		// Using Formula to find perimeter and area 
        double perimeter = 2 * radius * 3.14159;
        double area = radius * radius * 3.14159;
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
	}
}