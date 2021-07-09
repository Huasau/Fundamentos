package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		// ler o primeiro numero
		// ler numero 2
		// + - * / %
		
		 Scanner entrada = new Scanner(System.in);
		 
		System.out.printf("Informe o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.printf("Informe o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.printf("Informe a opera��o: ");
		String op = entrada.next();
		
		//l�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		 
		 entrada.close();
		
	}

}
