package oops.dynamicpolymorphism;

public class TestDynamicPolymorphism {

    public static void main(String[] args) {
        IOSPhone iPhone= null;

        iPhone = new IPhone5s();
        System.out.println("-------------------buying iPhone5s ");
        iPhone.buyIPhone();

        iPhone = new IPhone6s();
        System.out.println("\n\n-------------------buying iPhone6s ");
        iPhone.buyIPhone();

        iPhone = new IPhone7Plus();
        System.out.println("\n\n-------------------buying iPhone7Plus ");
        iPhone.buyIPhone();
    }
}
