package com.gos.oops.inheritence;

public class MountainBicycle extends Bicycle{

    private int seatHeight;

    public MountainBicycle() {
    }

    public MountainBicycle(int speed, int gear, int seatHeight) {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " and seatHeight is " + seatHeight;
    }
}
