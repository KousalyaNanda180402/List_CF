import java.util.*;

public class Three {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        a.add(10);
        a.add(5);
        a.add(-1);
        a.add(9);
        a.add(100);
        a.add(-65);
        System.out.println("ArrayList a is :: " + a);
        b.add(-1);
        b.add(5);
        b.add(30);
        b.add(9);
        System.out.println("ArrayList b is :: " + b);
        a.retainAll(b);
        System.out.println("After using a.retainAll(b) is :: ");
        System.out.println(a);

    }
}
