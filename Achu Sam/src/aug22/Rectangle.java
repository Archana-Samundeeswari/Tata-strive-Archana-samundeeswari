package aug22;

public class Rectangle {
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length) {
		this.width=1.0;
		this.length = length;
	}
	public double area() {
		return length*width;
	}

	@Override
	public String toString() {
		return "length: " + length + "\nwidth: " + width + "\nArea: "+area();
	}
	

	
	
	
	
}
