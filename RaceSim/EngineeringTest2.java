package RaceSim;

public class EngineeringTest2 {
	
	public static void main(String[] arg) {
		EngineeringTest2 engineeringTest = new EngineeringTest2();
		AeroPackages2 aero2 = new AeroPackages2();
		EngineConfig2 engine2 = new EngineConfig2();
		TireSelection2 tire2 = new TireSelection2(); 
		
		System.out.println("SPEC 2 VEHICLE COMPONENT CONFIGURATIONS");
		System.out.println("");
		
		System.out.println("Spec 2 Aero Packages");
		System.out.println("==============================");
		
		for (Iterator iterator = aero2.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Spec 2 Engine Configurations");
		System.out.println("==============================");
		for (Iterator iterator = engine2.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Spec 2 Tire Compounds");
		System.out.println("==============================");
		for (Iterator iterator = tire2.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
	}

}
