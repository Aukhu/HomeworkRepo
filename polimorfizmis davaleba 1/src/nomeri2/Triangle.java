package nomeri2;

public class Triangle extends Shape {
    private double z ;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double Perimeter(){
        return x+y+z ;
    }

    @Override
    public void NameData(){
        System.out.println("მოცემული ფიგურა სამკუთხედია და მისი გვერდებია: " + x  + " , "  + y + " , " + z);
    }
}
