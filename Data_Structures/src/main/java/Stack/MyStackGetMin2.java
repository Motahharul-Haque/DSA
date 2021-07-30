package Stack;

import java.util.Stack;

public class MyStackGetMin2 {

    Stack<Integer> s;
    int min;

    MyStackGetMin2()
    {
        s = new Stack<>();
    }

    void push(int x)
    {
        if (s.isEmpty()) {
            min = x;
            s.add(x);
        }
        else if(x <= min){
            s.add(2 * x - min);
            min = x;
        }
        else{
            s.add(x);
        }
    }

    int pop(){
        int t = s.peek();
        s.pop();
        if (t <= min) {
            int res = min;
            min = 2 * min - t;
            return res;
        }
        else {
            return t;
        }
    }

    int peek(){
        int t = s.peek();
        return ((t <= 0) ? min : t);
    }

    int getMin(){
        return min;
    }
}
class TestGetMin2{
    public static void main(String[] args) {
        MyStackGetMin1 s = new MyStackGetMin1();
        s.push(12);
        s.push(5);
        s.push(18);
        s.push(1);
        s.pop();
        System.out.println("Minimum element from stack : "+s.getMin());
    }
}