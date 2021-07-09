package fundamentos;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		
		/*
		 && = e (and)
		 v e v = v
		 v e f = f
		 v e f = f
		 f e f = f
		 
		 || = ou (or)
		 v ou v = v
		 v ou f = v
		 f ou v = v
		 f ou f = f
		 
		 ^ = ou exclusivo (xor)
		 v ^ v = f
		 v ^ f = v
		 v ^ f = v
		 f ^ f = f
		  
		 ! = not (negação)
		 !v = f
		 !f = v
		 */
	}

}
