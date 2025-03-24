import java.util.ArrayList;

public class Vet {
    
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        vetName = name;
        clients = new ArrayList<>();
    }

    public boolean addClient(Animal addedClient) {
        boolean addedAlready = false;
        for (Animal client: clients) {
            if (client.equals(addedClient)) {
                addedAlready = true;
            }
        }

        if (!addedAlready) {
            System.out.println("Welcome to " + vetName + " office, " + addedClient.getName());
            clients.add(addedClient);
            return true;
        } else {
            System.out.println(addedClient.getName() + " is already a client of " + vetName);
            return false;
        }
        
    }

    public void printClientList() {
        for (Animal client: clients) {
            System.out.println(client.getName() + ": " + client.getClass());
        }
    }
}
