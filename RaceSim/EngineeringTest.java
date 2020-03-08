package RaceSim;

public class EngineeringTest {
	
	public static void main(String[] arg) {
		EngineeringTest engineeringTest = new EngineeringTest();
		AeroPackages aero = new AeroPackages();
		EngineConfig engine = new EngineConfig();
		TireSelection tire = new TireSelection();
		
		System.out.println("SPEC 1 VEHICLE COMPONENT CONFIGURATIONS");
		System.out.println("");
		
		System.out.println("Spec 1 Aero Packages");
		System.out.println("==============================");
		
		for (Iterator iterator = aero.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Spec 1 Engine Configurations");
		System.out.println("==============================");
		for (Iterator iterator = engine.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Spec 1 Tire Compounds");
		System.out.println("==============================");
		for (Iterator iterator = tire.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
	}

}
