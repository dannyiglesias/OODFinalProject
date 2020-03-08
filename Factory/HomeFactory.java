package Factory;
public interface HomeFactory {
	
	public SuspensionConfig createSuspension();
	public AeroConfig createAero();
	public EngineConfig createEngine();
	public TireSelection[] createTires();
	
	
}
