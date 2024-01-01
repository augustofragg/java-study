package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer11d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] height = new double[n];
		char[] gen = new char[n];

		for (int i = 0; i < gen.length; i++) {
			System.out.printf("Altura da %da pessoa: ", (i + 1));
			height[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", (i + 1));
			gen[i] = sc.next().charAt(0);
		}

		int indexMenor = 0;
		int indexMaior = 0;
		int manNumber = 0;
		int womanNumber = 0;
		double maiorValor = 0;
		double menorValor = 0;
		double avgWoman = 0.0;
		double sum  = 0.0;
		for (int i = 0; i < gen.length; i++) {
			if (maiorValor < height[i]) {
				maiorValor = height[i];
				indexMaior = i;
				menorValor = maiorValor;
			} else if (menorValor > height[i]) {
				menorValor = height[i];
				indexMenor = i;
			}
			
			if(gen[i] == 'F') {
				sum += height[i];
				womanNumber += 1;
			}else if(gen[i] == 'M') {
				manNumber += 1;
			}
		}

		avgWoman = sum/womanNumber;
		
		System.out.printf("Menor altura = %.2f\n", height[indexMenor]);
		System.out.printf("Maior altura = %.2f\n", height[indexMaior]);
		System.out.printf("Media das alturas das mulheres = %.2f\n", avgWoman);
		System.out.printf("Numero de homens = %d",manNumber);
		
		sc.close();
	}
}
