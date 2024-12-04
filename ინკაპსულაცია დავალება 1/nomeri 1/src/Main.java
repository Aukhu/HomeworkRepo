public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather() ;

        weather.setCity("Qutaisi");
        weather.setWindSpeed(35.2) ;
        weather.setRainPercentage(10.5) ;
        weather.setRainy(false);
        weather.setCloudy(true);
        weather.setSunny(false);

        weather.printInfo();

        System.out.println( weather.RecommendationToGoForAWalk() ? " I recommend you to go for a walk" : " Stay at home" );

    }
}