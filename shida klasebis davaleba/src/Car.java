public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;
    private Engine engine;

    public class Engine {
        private String fuelType;
        private int cylinders;
        private double resource;

        public Engine(String fuelType, int cylinders, double resource) {
            this.fuelType = fuelType;
            this.cylinders = cylinders;
            this.resource = resource;
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

        public void setResource(double resource) {
            this.resource = resource;
        }

        public double getResource() {
            return resource;
        }

        public void printInfo() {
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Cylinders: " + cylinders);
            System.out.println("Mileage: " + resource);
        }
    }

    public Car(String manufacturer, String model, String licensePlate, String fuelType, int cylinders, double resource) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
        this.engine = new Engine(fuelType, cylinders, resource);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        engine.printInfo();
    }

    public Engine getEngine() {
        return engine;
    }
}
