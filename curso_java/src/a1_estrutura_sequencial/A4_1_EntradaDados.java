package a1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class A4_1_EntradaDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		String apelido;
		int idade;
		double altura;
		char genero;
		
		System.out.print("Apelido: ");
		//Ler um texto até o espaçamento
		apelido = sc.next();
		//Ler a quebra de linha pendente
		sc.nextLine();
		System.out.print("Nome: ");
		//Ler um texto até quebrar a linha
		nome = sc.nextLine();
		System.out.print("idade: ");
		//Ler numeros inteiros
		idade = sc.nextInt();
		System.out.print("Altura: ");
		//Ler numeros de ponto Flutuante
		altura = sc.nextDouble();
		System.out.print("Genero: ");
		//Ler um caractere
		genero = sc.next().charAt(0);
		
		System.out.println("---Dados-Informados---");
		System.out.println(apelido);
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(genero);
		sc.close();
	}
}
