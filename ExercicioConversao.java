package fundamentos;

import java.util.Scanner;

public class ExercicioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	 	System.out.print("Digite um salário: ");
	    String valor1 = entrada.next().replace(",", ".");
		double salario1 = Double.parseDouble(valor1);
		
		System.out.print("Digite segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		double salario2 = Double.parseDouble(valor2);
		
		System.out.print("Digite terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");
		double salario3 = Double.parseDouble(valor3);
		
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é: " + media);
		
		
		entrada.close();
		
		
	}

}
