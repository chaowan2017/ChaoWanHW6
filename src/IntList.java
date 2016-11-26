/**
 * Created by CHAOWAN on 11/15/2016.
 */
import java.util.ArrayList;
import java.util.List;


public class IntList {
    private ConsCell start;

    /**
     * Construct a new IntList given its first ConsCell.
     *
     */
    public IntList(ConsCell s) {
        start = s;
    }

    int x;
    int y;

    /**
     * Cons the given element h onto us and return the resulting IntList.
     * @param h the head int for the new list
     * @return the IntList with head h and us for the tail
     */
    public IntList cons (int h){
        return new IntList(new ConsCell(h,start));
    }

    /**
     * Get our length.
     * @return our int length
     */
    public int length(){
        int len = 0;
        ConsCell cell = start;
        while (cell != null) {
            len++;
            cell = cell.getTail();
        }
        return len;
    }

    /**
     * Print ourself to System.out.
     */
    public void print(){
        System.out.print("[");
        ConsCell a = start;
        while (a != null){
            System.out.print(a.getHead());
            a = a.getTail();
            if(a != null)
                System.out.print(",");
        }
        System.out.print("]");
    }


    public void contains(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println("if there is x in List" + ":" + list.contains(x));
}

    public boolean equals(Object o){
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));

    }
}
