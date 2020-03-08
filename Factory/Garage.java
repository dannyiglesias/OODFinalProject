package Factory;

public abstract class Garage {
	
	protected abstract Car createCar(String item);
	
	public Car orderCar(String type) {
		Car car = createCar(type);
		System.out.println("--- Developing " + car.getName() + "---");
		car.Coordinate();
		car.Assemble();
		car.Test();
		car.Ship();
		return car;
	}
	
	
}
