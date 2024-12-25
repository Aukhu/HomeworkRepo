package nomeri3;

public class Dolly extends ToyFactory{
        private double hairCost ;
        private double clothesCost ;
        private double anotherExpenses ;

    public Dolly(double hairCost, double clothesCost, double anotherExpenses) {
        this.hairCost = hairCost;
        this.clothesCost = clothesCost;
        this.anotherExpenses = anotherExpenses;
    }

    public double getHairCost() {
        return hairCost;
    }

    public void setHairCost(double hairCost) {
        this.hairCost = hairCost;
    }

    public double getClothesCost() {
        return clothesCost;
    }

    public void setClothesCost(double clothesCost) {
        this.clothesCost = clothesCost;
    }

    public double getAnotherExpenses() {
        return anotherExpenses;
    }

    public void setAnotherExpenses(double anotherExpenses) {
        this.anotherExpenses = anotherExpenses;
    }
    @Override
    public double Price(){
        return hairCost+clothesCost+anotherExpenses;
    }

}
