package Part2.Animals;

public class Dog extends Animal{
    private boolean aggressive;
    private boolean walked;

    public Dog(String name, int age, String species, boolean vaccinated) {
        super(name, age, species, vaccinated);
        aggressive = false;
        walked = false;
    }

    public boolean isAggressive() {return aggressive;}

    public boolean hasWalked() {return walked;}

    public void bite() {
        System.out.println(getName() + " BIT SOMEONE!!!!!!!!!");
        aggressive = true;
    }

    public void walk() {
        System.out.println(getName() + " has been taken for a walk!");
    }
}
