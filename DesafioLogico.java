package fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		
		// trabalho na terça
		// trabalho na quinta
		
		/*
		 se os dois trabalhos der certo, vou comprar a televisao de 50 polegadas 
		 se um trabalho der certo, vou comprar televisao de 32 polegadas
		 se comprar a tv de 50 ou a de 32, nós vamos tomar sorvete juntos
		 nao tomou sorvete ficou mais saudavel, tomou sorvete n ficou com fome
		 */

		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comproutv50 = trabalho1 && trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comprousorvete = trabalho1 || trabalho2;
		boolean maissaudavel = !comprousorvete;
		
		System.out.println("Comprou tv 50? " + comproutv50);
		System.out.println("Comprou tv 32? " + comproutv32);
		System.out.println("Comprou sorvete? " + comprousorvete);
		System.out.println("Mais saudável? " + maissaudavel);
		
		
	}

}
