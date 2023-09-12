
import java.util.*;

public class Two {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<String> b = new ArrayList<String>();
        a.add(10);
        a.add(20);
        a.add(24);
        a.add(18);
        a.add(4);
        a.add(-1);
        System.out.println(a);
        Collections.sort(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        b.add("Nandu");
        b.add("Neha");
        b.add("Singham");
        b.add("Neeraj");
        b.add("Lavanya");
        b.add("bt");
        System.out.println(b);
        Collections.sort(b, Collections.reverseOrder());
        System.out.println(b);
    }
}
