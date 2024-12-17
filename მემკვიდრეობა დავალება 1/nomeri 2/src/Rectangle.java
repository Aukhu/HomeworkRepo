public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    @Override
    public double area() {
        return length * width;
    }

    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }
}
