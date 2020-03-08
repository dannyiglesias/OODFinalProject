package Factory;

public class WestGarage extends Garage {

	protected Car createCar(String item) {
		Car car = null;
		HomeFactory carfactory = new WestCarFactory();
 
		if (item.equals("Spec1")) {
  
			car = new Spec1Car(carfactory);
			car.setName("Spec 1 Car");
  
		} else if (item.equals("Spec2")) {
 
			car = new Spec2Car(carfactory);
			car.setName("Spec 2 Car");
 
		} 
		return car;
	}

}

