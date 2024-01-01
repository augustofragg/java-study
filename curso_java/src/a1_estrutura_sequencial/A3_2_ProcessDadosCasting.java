package a1_estrutura_sequencial;

public class A3_2_ProcessDadosCasting {
	public static void main(String[] args) {
		int a, b;
		double r, r1;
		
		a = 5;
		b = 2;
		
		r = a/b;
		
		System.out.println(r);
		
		//com casting
		
		r1 = (double) a/b;
		System.out.println(r1);
		
	}
}
