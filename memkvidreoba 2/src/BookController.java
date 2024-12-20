public class BookController extends Employee{
    private double strictPoint ;

    public BookController(String firstName, String lastName, String ID) {
        super(firstName, lastName, ID);
        this.strictPoint = strictPoint;
    }

    public void setStrictPoint(){
        this.strictPoint = strictPoint ;
    }



    public double getStrictPoint(){
        return strictPoint ;
    }


}
