package Vehicles;
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        // Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        // System.out.println(myVehicle.getName());
        // System.out.println(myVehicle.getWheels());
        // myVehicle.move(10);
        // myVehicle.turn();
        // myVehicle.brake();

        // // testing all available methods on a Car object
        // Car myCar = new Car("Honda Civic", 4, "leather");
        // System.out.println(myCar.getName()); // inherited method
        // System.out.println(myCar.getWheels()); // inherited method
        // System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        // myCar.move(30); // inherited method
        // myCar.turn(); // inherited method
        // myCar.brake(); // inherited method
        // myCar.honk(); // method ONLY available on Car objects
        // myCar.lockDoors(); // method ONLY available on Car objects

        // // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        // Bicycle jimsBike = new Bicycle("Jerome's Ride", 2, 8);
        // System.out.println(jimsBike.getName());
        // System.out.println(jimsBike.getWheels());
        // System.out.println(jimsBike.getGearCount());
        // jimsBike.turn();
        // jimsBike.brake();
        // jimsBike.ringBell();
        // jimsBike.move(20);

        Scooter jimsScooter = new Scooter("Jim's Jack's John's", 3, true);
        System.out.println(jimsScooter.getName());
        System.out.println(jimsScooter.getWheels());
        System.out.println(jimsScooter.getIsRigid());
        jimsScooter.turn();
        jimsScooter.brake();
        jimsScooter.isSafe();
        jimsScooter.move(21);
    
    }
}