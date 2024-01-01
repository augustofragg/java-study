package e2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer6b {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		if((0 <= num) && (num <= 25)) {
			System.out.println("Intervalo [0,25]");
			
		}else if((25 < num) && (num <= 50)) {
			System.out.println("Intervalo (25,50]");
			
		}else if((50 < num) && (num <= 75)) {
			System.out.println("Intervalo (50,75]");
			
		}else if((75 < num) && (num <= 100)) {
			System.out.println("Intervalo (75,100]");
			
		}else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}
}
