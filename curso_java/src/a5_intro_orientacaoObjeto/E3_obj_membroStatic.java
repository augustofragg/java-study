package a5_intro_orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class E3_obj_membroStatic {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Uma classe com membros estáticos nao a nessecidade de instancia objetos
		
		System.out.print("Width: ");
		Calculator.width= sc.nextDouble();
		
		System.out.print("Height: ");
		Calculator.height = sc.nextDouble();
	
		ShowResult();
		
		sc.close();
	}
	
	public static void ShowResult() {
		System.out.printf("Area: %.2f%n",Calculator.Area());
		System.out.printf("Diagonal: %.2f%n",Calculator.Diagonal());
	}
}
