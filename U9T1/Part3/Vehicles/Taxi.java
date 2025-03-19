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
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric?: " + isElectric());
        System.out.println("discountApplied?: " + isDiscountApplied());
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
}
