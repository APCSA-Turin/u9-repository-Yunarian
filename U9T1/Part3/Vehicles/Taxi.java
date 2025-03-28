package Part3.Vehicles;

public class Taxi extends Car {
    private double fareCollected;
    
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);

    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        if ((getPassengers() >= 4 && !isDiscountApplied())) {
            setTollFee(getTollFee() * 0.5);
            setDiscount(true);
        }

        fareCollected += farePerRider * numRiders;

    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int peopleLeaving = getPassengers() - 1;
        fareCollected += peopleLeaving * farePerRider;

        boolean jim = dropOffPassengers(peopleLeaving);
        return jim;
    }

    public boolean validDriver(int driverAge, boolean driver, boolean taxiLicense) {
        boolean isValid = super.validDriver(driverAge, driver);
        if (isValid && taxiLicense) {
            return true;
        }
        return false;
    }
}
