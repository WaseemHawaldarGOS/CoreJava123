package oops.inheritence;

public class Bicycle {

    protected int speed;
    protected int gear;

    public Bicycle() {
    }

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    @Override
    public String toString() {
        return "speed is " + speed +
                " and no. of gears are " + gear ;
    }
}
