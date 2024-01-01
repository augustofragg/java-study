package entities;

public class Circle {
	public static final double pi = 3.14;
	
	public static double Circumference(double radius) {
		return 2.00 * pi * radius;
	}
	
	public static double Volume(double radius) {
		return 4.00 * pi * radius * radius * radius/3.0;
	}
	
}
