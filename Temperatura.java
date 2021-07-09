package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	
	// (°F - 32) x 5/9 = °C
	
	// Pela primeira vez que escrevi esse código
	       /* double x = 32;
			double y = 5.0;
			double z = 9.0;
			double f = 50;
					
			System.out.println((f - x) * y / z );*/
			
			
	         // Quando aprendi o básico
	         final double fator = 5.0 / 9.0;
			 final double ajuste = 32;
			 
			 double fahrenheit = 86;
			 double celsius = (fahrenheit - ajuste) * fator;
			 System.out.println("O resultado é " + celsius + "°C");
			 
}
}
