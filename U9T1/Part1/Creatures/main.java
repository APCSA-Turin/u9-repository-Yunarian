package Creatures;

public class main {
    public static void main(String[] args) {
        People j = new People(21, "j");
        System.out.println(j.getAge());
        System.out.println(j.getName());
        System.out.println();
        
        Adults q = new Adults(31, "q", "N/A", "N/A");
        System.out.println(q.getAge());
        System.out.println(q.getName());
        System.out.println(q.getPlaceOfWork());
        System.out.println(q.getPosition());
        q.employment();
        System.out.println();

        Children l = new Children(14, "l", false);
        System.out.println(l.getAge());
        System.out.println(l.getName());
        System.out.println(l.hasOwnRoom());
        l.independence();
        System.out.println(l.hasOwnRoom());
    }
}
