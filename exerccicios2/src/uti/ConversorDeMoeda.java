package uti;

public class ConversorDeMoeda {
	
	public static double Converter(double price, double quant) {
		return (price * quant) + ((price * quant) * 6 / 100); // converte em dolar e adiciona 6% da taxa IOF
	}

}
