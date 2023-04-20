package lab;

abstract class Shape {
	public abstract double calculateArea();
	}

class Circle extends Shape 
{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		}
	
	public double calculateArea() {
		return 3.14 * radius * radius;
		}
	}

class Rectangle extends Shape {
	private double l;
	private double w;
	
	public Rectangle(double l, double w) {
		this.l = l;
        this.w = w;
        }
	
	public double calculateArea() {
		return l * w;
		}
	}


public class Abstraction1 {
public static void main(String[] args) {
	Circle circle = new Circle(3);
	Rectangle rectangle = new Rectangle(33, 6);
	
	System.out.println("Area of the circle is: " + circle.calculateArea());
	System.out.println("Area of the rectangle is: " + rectangle.calculateArea());
	}
}
