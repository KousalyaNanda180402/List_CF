import java.util.*;

class one {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add("Nandu");
        a.add(100.00);
        a.add(null);
        a.add(true);
        System.out.println(a);
        Iterator i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        a.set(3, "Kousalya");
        System.out.println(a);

    }

}