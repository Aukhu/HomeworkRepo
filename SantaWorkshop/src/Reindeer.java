public class Reindeer extends WorkshopMember {
    private double flyingSpeed ;
    private String noseColor ;

    public Reindeer(String name, String nickName, int age, double flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public void Fly(){
        System.out.println(getName() + "flies");
    }



    public void fly(){
        System.out.println("Reindeer has set off with flying speed of "+flyingSpeed);
    }

    public void trainForChristmas(){
        flyingSpeed+=6.25;
        System.out.println( getName() + " trained and increased its top speed to " + flyingSpeed);
    }

    public char checkFitnessLevel(){
        if (flyingSpeed > 100 && getAge()<=5) {
            return 'A';
        } else if (flyingSpeed > 80 && getAge()<=7) {
            return 'B';
        } else if (flyingSpeed > 60 && getAge()<=9) {
            return 'C';
        } else if (flyingSpeed > 40 && getAge()<=12) {
            return 'D';
        } else {
            return 'F';
        }
    }



}
