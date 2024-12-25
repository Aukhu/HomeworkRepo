package nomeri1;

public class Square extends Shape{

    public Square(double length, int sideNum) {
        super(4, sideNum) ;
    }

    @Override
    public double Perimeter() {
        return 4*super.getLength() ;
    }

}
