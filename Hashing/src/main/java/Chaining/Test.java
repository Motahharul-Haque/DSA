package Chaining;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();

        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(Integer key)
    {
        int i = key % BUCKET;
        table.get(i).add(key);
    }

    boolean search(Integer key)
    {
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    void delete(Integer key)
    {
        int i = key % BUCKET;
        table.get(i).remove(key);
    }
}
public class Test {

    public static void main(String[] args) {
        MyHash m = new MyHash(7);
        m.insert(10);
        m.insert(20);
        m.insert(15);
        m.insert(7);
        System.out.println(m.search(10));
        m.delete(15);
        System.out.println(m.search(15));

    }
}
