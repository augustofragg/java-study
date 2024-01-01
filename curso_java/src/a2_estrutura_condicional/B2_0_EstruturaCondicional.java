package a2_estrutura_condicional;

import java.util.Scanner;

public class B2_0_EstruturaCondicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.print("Horas: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia !");

		} else {
			if ((12 <= hora) && (hora < 18)) {
				System.out.println("Boa Tarde !");

			} else {
				System.out.println("Boa noite !");

			}
		}

		sc.close();
	}
}
