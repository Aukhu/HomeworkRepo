public class Time {

    int second ;
    int minute ;
    int hour ;

    public Time(){
        this.second = 57;
        this.minute = 30;
        this.hour = 18 ;
    }

    void timeNow(){
        System.out.println("ახლანდელი დრო არის - " + hour + ":" + minute + ":" + second);
    }

}
