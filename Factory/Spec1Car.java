package Factory;

public class Spec1Car extends Car {
	HomeFactory carfactory;
	
	public Spec1Car(HomeFactory carfactory) {
		this.carfactory = carfactory;
	}


	void prepare() {
		System.out.println("Developing " + name);
		suspension = carfactory.createSuspension();
		aero = carfactory.createAero();
		engine = carfactory.createEngine();
		tires = carfactory.createTires();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}

	
	


