import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal thing = new Animal("Thing");
        Puppy spot = new Puppy("Spot");
        Cow marge = new Cow("Marge");
        Dog penny = new Dog("Penny");

        // ArrayList<Animal> jim = new ArrayList<>();
        // jim.add(thing); jim.add(spot); jim.add(marge); jim.add(penny);
        // for (Animal animal: jim) {
        //     System.out.println(animal.getName());
        // }

        Animal[] john = {thing, spot, marge, penny};

        // for (int i = 0; i < john.length; i++) {
        //     if (john[i] instanceof Cow) {
        //         Cow temp = (Cow) john[i];
        //         temp.milk();
        //     }
        // }

        // Vet johnsonsVet = new Vet("Johnson's Vet");
        // johnsonsVet.addClient(penny);
        // johnsonsVet.addClient(marge);
        // johnsonsVet.addClient(spot);
        // johnsonsVet.addClient(thing);

        // johnsonsVet.addClient(penny);
        // johnsonsVet.addClient(marge);
        // johnsonsVet.addClient(spot);
        // johnsonsVet.addClient(thing);

        Animal animal = new Animal("Thing");
        Puppy puppy = new Puppy("Spot");
        Cow cow = new Cow("Marge");
        Dog dog = new Dog("Penny");
        
        Vet vet = new Vet("Turin");
        System.out.println("----> Adding each client (successful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----> Adding each client again (unsuccessful):");
        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
        System.out.println("----------> PRINTING CLIENT LIST <----------");
        vet.printClientList();
        
    }
}
