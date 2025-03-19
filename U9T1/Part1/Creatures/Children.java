package Creatures;

public class Children extends People{
    private boolean hasOwnRoom;

    public Children (int age, String name, boolean hasOwnRoom) {
        super(age, name);
        this.hasOwnRoom = hasOwnRoom;
    }

    public boolean hasOwnRoom() {
        return hasOwnRoom;
    }

    public void independence() {
        if (getAge() >= 13) {
            System.out.println("The child should get their own room");
            hasOwnRoom = true;
        } else {
            System.out.println("The child should not get their own room");
        }
    }
}
