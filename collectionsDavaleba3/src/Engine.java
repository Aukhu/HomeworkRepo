public class Engine {
    private String fuelType;
    private int cylinders;
    private double displacement;

    public Engine(String fuelType, int cylinders, double displacement) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.displacement = displacement;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String toString() {
        return "Fuel: " + fuelType + ", Cylinders: " + cylinders + ", Displacement: " + displacement + "L\n";
    }
}
