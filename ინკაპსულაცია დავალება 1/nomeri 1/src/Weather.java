public class Weather {
    private String city;
    private double windSpeed ;
    private double rainPercentage ;
    private boolean rainy ;
    private boolean cloudy ;
    private boolean sunny ;

    public void setCity(String city){
        this.city = city ;
    }
    public void setWindSpeed(double windSpeed){
        this.windSpeed = windSpeed ;
    }
    public void setRainPercentage(double rainPercentage){
        this.rainPercentage = rainPercentage ;
    }
    public void setRainy(boolean rainy ){
        this.rainy = rainy ;
    }
    public void setCloudy(boolean cloudy ){
        this.cloudy = cloudy ;
    }

    public void setSunny(boolean sunny ){
        this.sunny = sunny ;
    }

    public void printInfo(){
        System.out.println( "Here is today's weather report in " + city + " : " );
        if(rainy) System.out.println(" It is rainy day ");
        else if(cloudy) System.out.println(" It is cloudy day ");
        else if(sunny) System.out.println(" It is sunny day ");
        System.out.println(" Current wind speed is " + windSpeed + "km/h ");
        System.out.println(" Rain covers " + rainPercentage + " % amount of city " );
    }

    public boolean RecommendationToGoForAWalk() {
        if (cloudy && windSpeed <= 10.0) return true;
        if (rainPercentage < 75 && windSpeed <= 17.5) return true;
        if (sunny && windSpeed <= 15.0) return true;
        if (rainy || windSpeed > 20.0) return false;
        return false;
    }

}
