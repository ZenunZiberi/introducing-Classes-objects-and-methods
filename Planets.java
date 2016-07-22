package IntroClasesObjectsMethods;

public class Planets {

	public static void main(String[] args) {
		
		int result;
		int result2;
		
		
		Planet earth = new Planet(124000, 34000);
		Planet jupiter = new Planet(430000, 13500,"Jupiter");

		result=earth.displaySize(210, 300);
		result2=jupiter.displaySize(120, 130);
		
		System.out.println(result);
		System.out.println(result2);
	}

	
}
