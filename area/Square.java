package area;

public class Square extends ShapeAbstract{
    public double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double calculateArea() {
       return Math.pow(side, 2);
    }

    
}
