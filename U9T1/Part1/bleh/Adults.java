package bleh;

public class Adults extends People{
    private String placeOfWork;
    private String position;

    public Adults(int age, String name, String placeOfWork, String position) {
        super(age, name);
        this.placeOfWork = placeOfWork;
        this.position = position;
    }

    String getPlaceOfWork() {
        return placeOfWork;
    }

    String getPosition() {
        return position;
    }

    public void employment() {
        if (placeOfWork.equals("N/A")) {
            System.out.println("They're unemployeed.");
        } else {
            System.out.println("They work at " + placeOfWork + " as a " + position);
        }
    }
    
}
