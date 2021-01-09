package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();

        m.put("Learning", 20);
        m.put("Java", 10);
        m.put("Is", 5);
        m.put("Easy", 15);

        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String, Integer> e : m.entrySet())
        {
            System.out.println(e.getKey()+" -----> "+e.getValue());
        }

    }
}
