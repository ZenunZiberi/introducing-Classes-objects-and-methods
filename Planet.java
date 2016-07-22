package IntroClasesObjectsMethods;

public class Planet {
	
	int opseg;
	int brzina;
	String name;
	
	Planet (int opseg, int brzina){
		this.opseg=opseg;
		this.brzina =brzina;
	}
	
	Planet (int opseg, int brzina, String name){
		this.opseg=opseg;
		this.brzina=brzina;
		this.name=name;
	}
	
		int displaySize(int x, int y){
			if(x>y) return  x/y;
			else return (x*x)/y;
		}
}
