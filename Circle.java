
public class Circle implements Shape{
	private double Radious;
	final double PI = Math.PI;
	
	public Circle(double radious) {
		super();
		Radious = radious;
	}
	
	public double getRadious() {
		return Radious;
	}
	public void setRadious(double radious) {
		Radious = radious;
	}

	@Override
	public String toString() {
		return "Circle [Radious=" + Radious;
	}

	@Override
	public double getArea() {
		return PI * (Radious*Radious);
	}
	
	
	
}
