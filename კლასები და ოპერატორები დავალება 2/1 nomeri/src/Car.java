public class Car {
    String company ;
    String model ;
    int year ;
    String plate ;

    public void Car(String company, String model, int year, String plate){
        this.company = company ;
        this.model = model;
        this.year = year ;
        this.plate = plate ;
    }

    void printInfo(){
        System.out.println("Car company is: " + company + ".");
        System.out.println("Car model is: " + model + "." );
        System.out.println("Car release date is: " + year + ".");
        System.out.println("Car plate is: " + plate + ".");
    }
}
