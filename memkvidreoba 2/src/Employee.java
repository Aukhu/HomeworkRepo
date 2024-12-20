public class Employee extends Library {
    private String lastName ;
    private String ID ;

    public Employee(String firstName, String lastName, String ID) {
        super(firstName);
        this.lastName = lastName;
        this.ID = ID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

}
