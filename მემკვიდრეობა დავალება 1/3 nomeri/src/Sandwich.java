public class Sandwich extends Product{
    private double size;

    public Sandwich(double price, String date, double size) {
        super(price, date);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}