package kader;
import java.util.Scanner;
public class areaofcircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		
		double radius = scanner.nextDouble();
		//Area = PI*radius*radius
		double area = Math.PI * (radius * radius); 
		System.out.println("The area of circle is: " + area); 
		
		double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+circumference) ;
	}

}
