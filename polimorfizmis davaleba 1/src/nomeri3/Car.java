package nomeri3;

public class Car extends ToyFactory{
        private double interior ;
        private double wheel ;
        private double wheelCounter;
        private double anotherExpenses ;

    public Car(double interior, double wheel, double wheelCounter , double anotherExpenses) {
        this.interior = interior;
        this.wheel = wheel;
        this.wheelCounter=  wheelCounter ;
        this.anotherExpenses = anotherExpenses;
    }

    public double getInterior() {
        return interior;
    }

    public void setInterior(double interior) {
        this.interior = interior;
    }

    public double getWheel() {
        return wheel;
    }

    public void setWheel(double wheel) {
        this.wheel = wheel;
    }
    public double getWheelCounter() {
        return wheelCounter;
    }
    public void setWheelCounter(double wheelCounter) {
        this.wheelCounter = wheelCounter;
    }


    public double getAnotherExpenses() {
        return anotherExpenses;
    }

    public void setAnotherExpenses(double anotherExpenses) {
        this.anotherExpenses = anotherExpenses;
    }

    @Override
    public double Price(){
        return interior+wheel*wheelCounter+anotherExpenses;
    }
}
