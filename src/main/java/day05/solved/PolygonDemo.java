package day05.solved;

public abstract class PolygonDemo {
	protected int numberOfSides;
	
	public PolygonDemo (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
}
