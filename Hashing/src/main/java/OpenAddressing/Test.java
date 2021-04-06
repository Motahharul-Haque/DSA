package OpenAddressing;

public class Test {

    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);

        if(mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");

        mh.erase(56);

        if(mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
