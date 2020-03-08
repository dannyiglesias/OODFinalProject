package Factory;

public class WestCarFactory implements HomeFactory {

	@Override
	public SuspensionConfig createSuspension() {
		// TODO Auto-generated method stub
		return new SuspensionSpec2();
	}

	@Override
	public AeroConfig createAero() {
		// TODO Auto-generated method stub
		return new AeroSpec2();
	}

	@Override
	public EngineConfig createEngine() {
		// TODO Auto-generated method stub
		return new EngineSpec2();
	}

	@Override
	public TireSelection[] createTires() {
		// TODO Auto-generated method stub
		TireSelection tires[] = { new Medium(), new Hard()};
		return tires;

	}

}
