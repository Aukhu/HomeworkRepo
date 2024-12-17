public class Milk extends Product{
    private double volume;

    public Milk(double price, String date, double volume) {
        super(price, date);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}