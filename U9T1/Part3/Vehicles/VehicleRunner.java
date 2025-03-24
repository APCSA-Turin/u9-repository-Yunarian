package Part3.Vehicles;

public class VehicleRunner {
    public static void main(String[] args) {  
      Vehicle myVehicle = new Vehicle("Q", .5, 1);
      Car myCar = new Car("M", 2.0, 1, false);
      Truck myTruck = new Truck("L", 1.75, 1, 4, false);
      Taxi myTaxi = new Taxi("Z", 2.5, 0, false, 2.25);

      System.out.println(myVehicle.validDriver(16, true));
      System.out.println(myVehicle.validDriver(8, true));
      System.out.println(myVehicle.validDriver(16, false));
      System.out.println(myVehicle.validDriver(18, false));
      System.out.println();

      System.out.println(myCar.validDriver(16, true));
      System.out.println(myCar.validDriver(8, true));
      System.out.println(myCar.validDriver(16, false));
      System.out.println(myCar.validDriver(18, false));
      System.out.println();

      System.out.println(myTruck.validDriver(16, true));
      System.out.println(myTruck.validDriver(8, true));
      System.out.println(myTruck.validDriver(16, false));
      System.out.println(myTruck.validDriver(18, false));
      System.out.println();

      System.out.println(myTaxi.validDriver(16, true, true));
      System.out.println(myTaxi.validDriver(16, true, false));
      System.out.println(myTaxi.validDriver(8, true, true));
      System.out.println(myTaxi.validDriver(16, false, false));
      System.out.println(myTaxi.validDriver(16, false, true));
      System.out.println(myTaxi.validDriver(18, false, false));
      System.out.println(myTaxi.validDriver(18, false, true));
      System.out.println();
    }
}
