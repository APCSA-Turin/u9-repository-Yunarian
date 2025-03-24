package Part3.Vehicles;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Trailer?: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String plate = getLicensePlate();
            String last2 = plate.substring(plate.length() - 2);

            return (last2.equals("MX") && axles > 4) || (last2.equals("LX") && axles <= 4);
        }

        return true;
    }

    @Override
    public double calculateTollPrice() {
      double toll = getTollFee() * axles;
      if (hasTrailer) {
        toll *= 2;
      }

      return toll;
    }
  }
