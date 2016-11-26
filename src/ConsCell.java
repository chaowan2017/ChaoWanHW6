/**
 * Created by CHAOWAN on 11/15/2016.
 */
public class ConsCell {
    private int head;
    private ConsCell tail;
    public ConsCell(int h, ConsCell t){
        head = h;
        tail = t;
    }
    public int getHead(){
        return head;
    }
    public ConsCell getTail(){
        return tail;
    }
    public void setTail(ConsCell t){
        tail = t;
    }

    /**
     * Get the length of a list of ConsCells.
     * return the int length
     */
    public static int length(ConsCell a){
        int len = 0;
        while (a != null){
            len++;
            a = a.getTail();
        }
        return len;
    }
    /**
     * return the result of consing an int onto a list of ConCells.
     * return the first ConsCell in the new list
     */
    public static ConsCell cons(int a, ConsCell b) {
        return new ConsCell(a,b);
    }

}
