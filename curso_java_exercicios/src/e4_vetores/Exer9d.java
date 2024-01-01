package e4_vetores;

import java.util.Scanner;

public class Exer9d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < idade.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n",(i+1));
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int posicaoMaior = 0;
		int value = 0;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > value) {
				value = idade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[posicaoMaior]);
		sc.close();
	}
}
