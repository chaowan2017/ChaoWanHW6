/**
 * Created by CHAOWAN on 11/15/2016.
 */
public class Driver {
    public static void main(String[] args){
        IntList a = new IntList(null);
        IntList b = a.cons(2);
        IntList c = b.cons(1);
        int x = a.length() + b.length() + c.length();
        a.print();
        b.print();
        c.print();
        System.out.println(x);
    }
}
