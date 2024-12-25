package nomeri5;

public class Car implements Engine, Directions{
    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public void left() {
        System.out.println("Car is turning left");
    }

    @Override
    public void right() {
        System.out.println("Car is turning right");
    }
}