package e2_estrutura_condicional;

import java.util.Scanner;

public class Exer4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, aux;
		int inicial = sc.nextInt();
		int f = sc.nextInt();

		if (inicial > f) {
			aux = 24 - inicial;
			d = aux + f;
			System.out.println("O JOGO DUROU " + d + " HORAS(S)");
		} else if (inicial < f) {
			d = f - inicial;
			System.out.println("O JOGO DUROU " + d + " HORAS(S)");
		} else {
			aux = 24 - inicial;
			d = aux + f;
			System.out.println("O JOGO DUROU " + d + " HORAS(S)");
		}

		sc.close();
	}
}
