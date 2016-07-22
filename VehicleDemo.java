package IntroClasesObjectsMethods;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(7,16,20);
		Vehicle sportsCar = new Vehicle(2,14,10);
		
		double gallons;
		int distance=252;
		int distance2=102;
		int range1;
		int range2;

		
		
				
//		//asign values to fields in minivan
//		minivan.passengers = 7;
//		minivan.fuelcap = 16;
//		minivan.mpg = 20;
//	
//		
//		//asign values to fields in sportcar
//		sportsCar.passengers=2;
//		sportsCar.fuelcap=14;
//		sportsCar.mpg=10;
		
		//get the ranges
		range1=minivan.range();
		range2=sportsCar.range();
		
		
		System.out.println("minivan can carry " + minivan.passengers+" with range of "+range1+" miles");
		
		System.out.println("\nsportsCar can carry "+sportsCar.passengers + " with range of "+range2+" miles");
	
	
		
		gallons=minivan.fuelneeded(200,100);
	
		System.out.println("\nto go "+distance2+" miles minivan need "+gallons+" gallons of fuel");
		
		gallons=sportsCar.fuelneeded(200,100);
		
		System.out.println("\nto go "+distance+" miles sports car need "+gallons+" gallons of fuel");
	}

}
