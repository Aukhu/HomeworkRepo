package nomeri2;

public class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double Perimeter(){
        return (x+y)*2 ;
    }

    @Override
    public void NameData(){
        System.out.println("მოცემული ფიგურა მართკუთხედია და მისი გვერდებია: " + x  + " , "  + y );
    }
}
