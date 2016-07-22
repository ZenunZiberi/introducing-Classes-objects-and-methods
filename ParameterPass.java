package IntroClasesObjectsMethods;

public class ParameterPass {

	public static void main(String[] args) {

		Chknum e = new Chknum();
		if (e.isEven(20,2)) System.out.println("10 is even");
		if (e.isEven(30,20)) System.out.println("9 is even");
		if (e.isEven(40,20)) System.out.println("8 is even");
	}

}
