package kader;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		System.out.println("enter side of square:");
		Scanner scan = new Scanner(System.in);
		
		double side = scan.nextInt();
		
		double area = side*side;
		
		System.out.println("area of square is "+area);
		
	}

}
