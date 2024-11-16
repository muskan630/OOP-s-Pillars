package geometry;

public class Rectangle {
    public int length;
	public int breadth;
	//constructor for initializing value 
	public Rectangle(int length , int breadth ) {
		this.length= length;
		this.breadth = breadth;
	}
	public int rect_Area(int rect_l , int rect_b) {
		int area = length * breadth;
		return area;
	}
	
}
