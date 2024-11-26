package geometry;

public class Circle {
    public double radius; //public instance variable
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public int cir_Area(double radius) {
		double area = Math.PI* Math.pow(radius, 2);
		return (int) area ;
	}
}
