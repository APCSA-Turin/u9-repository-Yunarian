package Vehicles;
public class Scooter extends Vehicle{
    private boolean isRigid;

    Scooter(String name, int wheels, boolean isRigid) {
        super(name, wheels);
        this.isRigid = isRigid;
    }

    public boolean getIsRigid() {
        return isRigid;
    }

    public void isSafe() {
        if (isRigid) {
            System.out.println("This can be safely given to a 5 year old.");
        } else {
            System.out.println("This cannot be given safely to a 5 year old.");
        }
    }
}
