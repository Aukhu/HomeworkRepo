public class Manager extends Colleague{
    private String managerID;

    public Manager (String name , String surname , int age , String colleagueID , String managerID ){
        super(name,surname,age,colleagueID) ;
        this.managerID = managerID ;
    }

    public void setManagerID(){
        this.managerID = managerID;
    }

    public String getManagerID(){
        return managerID;
    }
}
