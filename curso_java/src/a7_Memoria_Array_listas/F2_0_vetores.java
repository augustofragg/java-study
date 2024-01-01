package a7_Memoria_Array_listas;


import java.util.Locale;
import java.util.Scanner;

public class F2_0_vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0;i < vect.length;i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sum = sum + vect[i];
		}
		
		double avg = sum/vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f",avg);
		
		sc.close();
	}
}
