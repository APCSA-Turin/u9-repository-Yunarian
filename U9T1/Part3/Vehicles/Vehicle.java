package Part3.Vehicles;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }

    public void setPassengers(int newPassenger) {
        passengers = newPassenger;
    }

    public void setTollFee(double newTollFee) {
        tollFee = newTollFee;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void printInfo() {
      System.out.println("License plate: " + licensePlate);
      System.out.println("Toll fee: " + tollFee);
      System.out.println("Passengers: " + passengers);
    }

    public boolean validDriver(int driverAge, boolean driver) {
      if (driverAge < 16 || !driver) {
        return false;
      }
      return true;
    }
  }
