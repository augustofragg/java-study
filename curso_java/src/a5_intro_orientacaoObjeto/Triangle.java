package a5_intro_orientacaoObjeto;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public Triangle() {
	}
	
	public double area() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p * (p -a) * (p -b) *(p -c));
	}
}
