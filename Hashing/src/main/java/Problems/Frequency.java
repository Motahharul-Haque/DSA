package Problems;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void main(String[] args) {
        int[] inArray = { 15, 16, 27, 27, 28, 15};

        countFrequency(inArray);
    }

    private static void countFrequency(int[] inArray) {
        int len = inArray.length;
        Map<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < len; i++)
        {
            if (m.containsKey(inArray[i]) == true) {
                m.put(inArray[i], m.get(inArray[i])+1);
            }
            else
            {
                m.put(inArray[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> e : m.entrySet())
        {
            System.out.println(e.getKey()+" -----> "+e.getValue());
        }
    }
}
