package Part3.Warmup;
public class ZooAnimal {
    private String name;
    private int age;
 
 
    public ZooAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public int getAge() {
        return age;
    }
 
 
    public void feed() {
        System.out.println("Yum! Food!");
    }
 }
 