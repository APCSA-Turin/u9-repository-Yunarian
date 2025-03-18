package Vehicles;

public class Bicycle extends Vehicle{

    private int gearCount;
    
    Bicycle(String name, int wheels, int gears){
        super(name, wheels);
        gearCount = gears;

    }

    public int getGearCount() {
        return gearCount;
    }

    public void ringBell() {
        System.out.println("RING! RING!");
    }
}