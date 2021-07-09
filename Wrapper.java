package fundamentos;

public class Wrapper {
public static void main(String[] args) {
	
     // Byte
	        byte b = 100;
			short s = 1000;
			Integer i = 10000;   //int
			long l = 100000;
			
			System.out.println(b);
			System.out.println(s);
			System.out.println(i * 3);
			System.out.println(l / 3);
			
			Float f = 123.10F;
			System.out.println(f);
			
			Double d = 1234.568;
			System.out.println(d);
			
			Boolean bo = Boolean.parseBoolean("true");
			System.out.println(bo);
			System.out.println(bo.toString().toUpperCase());
			
			Character c = '#'; //Char
			System.out.println(c + "...");
			
}
}
