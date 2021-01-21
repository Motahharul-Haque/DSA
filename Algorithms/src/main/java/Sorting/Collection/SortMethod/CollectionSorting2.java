package Sorting.Collection.SortMethod;

import java.util.*;
import java.lang.*;

class Point implements Comparable<Point>
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point P)
    {
        return this.x - P.x;
    }
}
class CollectionSorting2
{
    public static void main(String[] args)
    {
        // Create a list of Integers
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));

        // List is sorted in the natural order
        Collections.sort(list);

        // Displaying the points
        for (Point p: list)
            System.out.println(p.x + " " + p.y);
    }
}
