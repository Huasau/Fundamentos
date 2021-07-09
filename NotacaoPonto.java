package fundamentos;

public class NotacaoPonto {
public static void main(String[] args) {
	
    String s = "Bom dia X";
    s = s.replace("X", "senhora");
	s = s.toUpperCase();
	s = s.concat("!!!");
	
	System.out.println(s);
	
	String x = "leo".toUpperCase();
	System.out.println(x);
	
	String y = "Bom dia x".replace("X", "Gui").toUpperCase().concat("!!!");
	System.out.println(y);

	//tipos primitivos nao tem o operador "."
	
}
}
