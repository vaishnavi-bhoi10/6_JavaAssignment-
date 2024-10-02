package Assignment6;

abstract class Shape {
	final static double PI = 3.14;
	protected double l = 4;
	protected double b = 5;
	protected double h = 6;
	protected double r = 4;

	abstract public void Sarea();

	abstract public void perimeter();

	public void values() {
		System.out.println("--------------");
	}

}

class Circle extends Shape {

	public final void Sarea() {
		System.out.println("Area of Circle : " + r * PI * r);
	}

	public void perimeter() {

		System.out.println("Perimeter of Circle : " + 2 * PI * r);
	}
}

class Triangle extends Shape {

	public final void Sarea() {
		System.out.println("Area of Triangle : " + 0.5 * b * h);
	}

	public void perimeter() {

		System.out.println("Perimeter of Triangle : " + (l + b + h));
	}
}

class Rectangle extends Shape {

	public final void Sarea() {
		System.out.println("Area of Rectangle : " + l * b);
	}

	public void perimeter() {

		System.out.println("Perimeter of Rectangle : " + ((l + b) * 2));
	}
}

public class GeometricShape {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("------------Circle-----------");
		circle.Sarea();
		circle.perimeter();
		System.out.println();
		// -------------------------------------
		Triangle triangle = new Triangle();
		System.out.println("------------Triangle-----------");
		triangle.Sarea();
		triangle.perimeter();
		System.out.println();
		// -------------------------------------
		Rectangle rectangle = new Rectangle();
		System.out.println("------------Rectangle-----------");
		rectangle.Sarea();
		rectangle.perimeter();
	}

}
