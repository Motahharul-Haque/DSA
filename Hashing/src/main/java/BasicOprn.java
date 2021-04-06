public class BasicOprn {

    int[] table=new int[1000];

    void insert(int i){
        table[i]=1;
    }

    void del(int i){
        table[i]=0;
    }

    int search(int i){
        return table[i];
    }
}

class Test {

    public static void main(String[] args)
    {
        BasicOprn data=new BasicOprn();
        data.insert(10);
        data.insert(20);
        data.insert(119);
        System.out.println(data.search(10));
        System.out.println(data.search(20));
        data.del(119);
        System.out.println(data.search(119));

    }
}


