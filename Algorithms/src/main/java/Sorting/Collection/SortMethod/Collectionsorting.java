package Sorting.Collection.SortMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsorting
{
    public static void main(String[] args)
    {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
