package Part2.Animals;

public class Animal {
    
    private String name;
    private int age;
    private boolean vaccinated;
    private String species;

    public Animal(String name, int age, String species, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.vaccinated = vaccinated;
    }

    public String getName() {return name;}

    public String getSpecies() {return species;}

    public int getAge() {return age;}

    public boolean isVaccinated() {return vaccinated;}

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }

    public void feed() {
        System.out.println(name + " has been fed.");
    }

    public void info() {
        System.out.println(name + " is a " + species + ", and is " + age + " years old.");
    }
}
