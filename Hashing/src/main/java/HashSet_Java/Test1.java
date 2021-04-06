package HashSet_Java;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();

        h.add("Learning");
        h.add("Java");
        h.add("Is");
        h.add("Easy");

        System.out.println(h);
        System.out.println(h.contains("Java"));

        Iterator<String> i = h.iterator();

        while(i.hasNext())
        {
            System.out.print(i.next()+"  ");
        }

    }
}
