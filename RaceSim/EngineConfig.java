package RaceSim;

import java.util.ArrayList;
import java.util.List;

public class EngineConfig implements Config {
	private List<String> Packages = new ArrayList<String>();
	
	public EngineConfig() {
		Packages.add("Spec 1 Low Fuel Configuration: Lower weight, requires careful managing");
		Packages.add("Spec 1 Medium Fuel Configuration: Slightly heavier but allows for more aggressive passing");	
	}
	public Iterator getIterator() {
		return new aeroIterator();	
	}
	
	private class aeroIterator implements Iterator {
		
		private int position;
		
		@Override
		public boolean hasNext() {
			if(position < Packages.size())
				return true;
			return false;
			
		}
		
		@Override 
		public Object next() {
			if (this.hasNext())
				return Packages.get(position++);
			return null;
		}
		
	}

	public Iterator getIterator1() {
		// TODO Auto-generated method stub
		return null;
	}
			
			
	

}