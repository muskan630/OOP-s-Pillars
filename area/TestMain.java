package area;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Your circle area is : " +circle.calculateArea());
        Square square = new Square(4);
        System.out.println("Your square area is : " +square.calculateArea());
    }
}
