package Part3.Warmup;

public class BabyKoala extends ZooAnimal {

    private boolean eyesOpen;
 
    public BabyKoala(String name) {
        super(name, 0);
        this.eyesOpen = false;
    }
 
 
    public boolean hasEyesOpen() {
        return eyesOpen;
    }
 
 
    public void openEyes() {
        System.out.println("hello world!");
        eyesOpen = true;
    }
 }
 
