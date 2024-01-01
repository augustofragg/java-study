package entities;

public class Student {
	public String name;
	public double nota;
	
	public void Sgrade(double nota) {
		this.nota = this.nota + nota;
	}
	
	public String toString() {
		return "Final Grade = " + String.format("%.2f",nota);
	}
}
