package IntroClasesObjectsMethods;

public class Vehicle {

	int passengers, fuelcap, mpg;


	Vehicle(int p,int f, int m)	{
		this.passengers=p;
		this.fuelcap=f;
		this.mpg=m;
	}
	
	int range() {
		return fuelcap * mpg;
	}

	double fuelneeded(long x,int y) {
		return (double)  (x+y)/mpg;
	}

}

