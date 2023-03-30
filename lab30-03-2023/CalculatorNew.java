package basic;

 import java.util.*;
 
 class Operator{
	 public int addition(int a, int b)
	 {
		 return a+b;
	 }
	 public int subtraction(int a, int b)
	 {
		 return a-b;
	 }
	 public int multiply(int a, int b)
	 {
		 return a*b;
	 }
	 public double division(double a, double b)
	 {
		 return a/b;
	 }
 }

public class CalculatorNew {

	public static void main(String[] args) {
		Operator op = new Operator();
		System.out.println("Welcome to our Calculator");
		Scanner sc = new Scanner(System.in);
		int x,y;
		do {
		System.out.println("Which operation you would like to perform");
		System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Exit");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter first digit:");
			x = sc.nextInt();
			System.out.println("Enter sencond digit:");
			y = sc.nextInt();
			System.out.println("Sum: "+op.addition(x, y));
			break;
		
		case 2:
			System.out.println("Enter first digit:");
			x = sc.nextInt();
			System.out.println("Enter sencond digit:");
			y = sc.nextInt();
			System.out.println("Difference: "+op.subtraction(x, y));
			break;
			
		case 3:
			System.out.println("Enter first digit:");
			x = sc.nextInt();
			System.out.println("Enter sencond digit:");
			y = sc.nextInt();
			System.out.println("Product: "+op.multiply(x, y));
			break;
		
		case 4:
			System.out.println("Enter first digit:");
			x = sc.nextInt();
			System.out.println("Enter sencond digit:");
			y = sc.nextInt();
			System.out.println("Quotient: "+op.division(x, y));
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid input!!");
		}
		}
		while(true);
	}

}
