public  class Colleague extends Human {
    private String colleagueID;

    public Colleague (String name , String surname , int age ,String colleagueID ){
        super(name,surname,age) ;
        this.colleagueID = colleagueID ;
    }

    public void setColleagueID(){
        this.colleagueID = colleagueID ;
    }

    public String colleagueID(){
        return colleagueID ;
    }


}
