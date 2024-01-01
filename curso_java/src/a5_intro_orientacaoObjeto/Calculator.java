package a5_intro_orientacaoObjeto;

public class Calculator {
	public static double width;
	public static double height;
	
	public static double Area() {
		return width * height;
	}
	
	public static double Diagonal() {
		return Math.sqrt(Math.pow(width,2.0) + Math.pow(height,2.0));
	}
}
