public class Main {
    public static void main(String[] args) {
        Car myCar = new Car() ;
        Car myCar2 = new Car() ;

        myCar.company = "koenigsegg" ;
        myCar.model = "Jesko Absolut" ;
        myCar.year = 2013 ;
        myCar.plate = "531–563KMH";

        myCar2.company = "Pagani" ;
        myCar2.model = "Zonda R" ;
        myCar2.year = 2013 ;
        myCar2.plate = "370-375 KMH";

        myCar.printInfo();
        myCar2.printInfo();
    }
}