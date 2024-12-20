public class BookGiver extends Employee{
    private String startTime ;
    private String endTime;

    public BookGiver(String firstName , String lastName , String ID , String startingTime , String endingTime ){
        super(firstName , lastName , ID ) ;
        this.startTime = startingTime ;
        this.endTime = endingTime ;
    }

    public void setStartingTime(String startingTime) {
        this.startTime = startingTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }


}
