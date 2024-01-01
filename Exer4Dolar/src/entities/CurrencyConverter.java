package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double Converter(double dolar, double real) {
		return dolar * real * (1.0 +IOF);
	}
	
}
