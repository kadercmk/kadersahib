package kader;
import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		Scanner kader = new Scanner(System.in);
		System.out.println("addition");
		int num1=kader.nextInt();
		int num2=kader.nextInt();
		int add = num1+num2;
		System.out.println(""+add);
		
		System.out.println("substraction");
		int num3=kader.nextInt();
		int num4=kader.nextInt();
		int sub =num3-num4;
		System.out.println(" "+sub);
		
		System.out.println("multiplication");
		int num5=kader.nextInt();
		int num6=kader.nextInt();
		int mul =num5*num6;
		System.out.println(""+mul);
		
		System.out.println("division");
		int num7=kader.nextInt();
		int num8=kader.nextInt();
		int div=num7-num8;
		System.out.println(""+div);
		
		System.out.println("modulation");
		int num9=kader.nextInt();
		int num10=kader.nextInt();
		int mod=num9-num10;
		System.out.println(""+mod);
		
		
		
		
	}

}
