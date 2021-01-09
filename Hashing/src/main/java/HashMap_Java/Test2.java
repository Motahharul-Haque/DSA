package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();

        m.put("Learning", 20);
        m.put("Java", 10);
        m.put("Is", 5);
        m.put("Easy", 15);

        if(m.containsKey("Java"))
            System.out.println("Yes");
        else
            System.out.println("No");

        m.remove("Java");

        if(m.containsKey("Java"))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(m.size());

    }
}
