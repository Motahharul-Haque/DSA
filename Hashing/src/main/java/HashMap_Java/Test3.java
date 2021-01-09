package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();

        m.put("Learning", 20);
        m.put("Java", 10);
        m.put("Is", 5);
        m.put("Easy", 15);

        if(m.containsValue(10))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(m.get("Java"));
        System.out.println(m.get("Course"));


    }
}
