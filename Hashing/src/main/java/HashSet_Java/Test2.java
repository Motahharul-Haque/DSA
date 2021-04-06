package HashSet_Java;

import java.util.HashSet;

public class Test2 {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();

        h.add("Learning");
        h.add("Java");
        h.add("Is");
        h.add("Easy");

        System.out.println(h.size());
        h.remove("Is");
        System.out.println(h.size());

        for(String s : h)
        {
            System.out.println(s+"  ");
        }
    }
}
