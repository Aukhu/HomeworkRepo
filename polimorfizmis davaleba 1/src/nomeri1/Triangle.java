package nomeri1;

public class Triangle extends Shape {
    public Triangle(double length, int sideNum) {
        super(3 , sideNum );
    }

    @Override
    public double Perimeter(){
        return 3*super.getLength() ;
    }
}
