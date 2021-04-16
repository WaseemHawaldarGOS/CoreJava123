package oops.inheritence;

public class TestInheritence {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(100, 3);
        System.out.println("current speed is "+bicycle.speed);
        bicycle.applyBrake(10);
        System.out.println("speed after decrement by 10 is "+bicycle.speed);
        bicycle.speedUp(50);
        System.out.println("speed after increment by 50 is "+bicycle.speed);
        System.out.println("Bicyle details are \n"+bicycle.toString());

        MountainBicycle mountainBicycle = new MountainBicycle(200,5,25);
        System.out.println("\n\nMountain bicycle details are \n"+mountainBicycle.toString());
    }
}
