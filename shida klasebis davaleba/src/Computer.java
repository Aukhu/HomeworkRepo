public class Computer {

        private String manufacturerCountry;
        private String firm;
        private double price;
        private boolean hasWarranty;

    public Computer(String manufacturerCountry, String firm, double price, boolean hasWarranty) {
        this.manufacturerCountry = manufacturerCountry;
        this.firm = firm;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }
    public void printComputerInfo() {
        System.out.println("Manufacturer Country: " + manufacturerCountry);
        System.out.println("Firm: " + firm);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + (hasWarranty ? "Yes" : "No"));
    }

    public class Monitor{
            private double diagonalInches;
            private String resolution;
            private int refreshRate;

        public Monitor(double diagonalInches, String resolution, int refreshRate) {
            this.diagonalInches = diagonalInches;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public double getDiagonalInches() {
            return diagonalInches;
        }

        public void setDiagonalInches(double diagonalInches) {
            this.diagonalInches = diagonalInches;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public int getRefreshRate() {
            return refreshRate;
        }

        public void setRefreshRate(int refreshRate) {
            this.refreshRate = refreshRate;
        }
        public void printMonitorInfo() {
            System.out.println("Monitor Diagonal: " + diagonalInches + " inches");
            System.out.println("Resolution: " + resolution);
            System.out.println("Refresh Rate: " + refreshRate + " Hz");
        }
    }
    public class Motherboard{
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public int getRamSlots() {
            return ramSlots;
        }

        public void setRamSlots(int ramSlots) {
            this.ramSlots = ramSlots;
        }

        public String getRamType() {
            return ramType;
        }

        public void setRamType(String ramType) {
            this.ramType = ramType;
        }

        public int getFsbSpeed() {
            return fsbSpeed;
        }

        public void setFsbSpeed(int fsbSpeed) {
            this.fsbSpeed = fsbSpeed;
        }
        public void printMotherboardInfo() {
            System.out.println("RAM Slots: " + ramSlots);
            System.out.println("RAM Type: " + ramType);
            System.out.println("FSB Speed: " + fsbSpeed + " MHz");
        }
    }
}
