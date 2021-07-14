package Problems;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;

class Node2 {
    int key;
    int value;
    Node2 pre;
    Node2 next;

    public Node2(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private HashMap<Integer, Node2> map;
    private int capacity, count;
    private Node2 head, tail;

    public LRUCache(int capacity)
    {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node2(0, 0);
        tail = new Node2(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }

    public void deleteNode(Node2 node)
    {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node2 node)
    {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    public int get(int key)
    {
        if (map.get(key) != null) {
            Node2 node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);
            System.out.println("Got the value : " +
                    result + " for the key: " + key);
            return result;
        }
        System.out.println("Did not get any value" +
                " for the key: " + key);
        return -1;
    }

    public void set(int key, int value)
    {
        System.out.println("Going to set the (key, "+
                "value) : (" + key + ", " + value + ")");
        if (map.get(key) != null) {
            Node2 node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }
        else {
            Node2 node = new Node2(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            }
            else {
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addToHead(node);
            }
        }
    }
}

public class TestLRUCache {
    public static void main(String[] args)
    {

        LRUCache cache = new LRUCache(2);

        cache.set(1, 10);

        cache.set(2, 20);

        System.out.println("Value for the key: 1 is " + cache.get(1));

        cache.set(3, 30);

        System.out.println("Value for the key: 2 is " + cache.get(2));

        cache.set(4, 40);

        System.out.println("Value for the key: 1 is " + cache.get(1));

        System.out.println("Value for the key: 3 is " + cache.get(3));

        System.out.println("Value for the key: 4 is " + cache.get(4));
    }
}

