package Factory;

public class Spec2Car extends Car {
	HomeFactory carfactory;
	
	public Spec2Car(HomeFactory carfactory) {
		this.carfactory = carfactory;
	}
	
	public void prepare() {
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

	
	