package Part2.Animals;

public class Cat extends Animal {
    private int clawLength;
    private boolean playedWith;
    
    public Cat(String name, int age, String species, boolean vaccinated, int clawLength) {
        super(name, age, species, vaccinated);
        this.clawLength = clawLength;
        playedWith = false;
    }

    public int getClawLength() {return clawLength;}

    public boolean hasBeenPlayedWith() {return playedWith;}

    public void tooLong() {
        if (clawLength >= 3) {
            System.out.println(getName() + "'s claws should be cut shorter.");
        } else {
            System.out.println(getName() + "'s claws are short.");
        }
    }

    public void play() {
        System.out.println("Someone played with " + getName() + "!");
        playedWith = true;
    }

}
