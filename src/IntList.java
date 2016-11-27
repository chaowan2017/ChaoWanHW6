/**
 * Created by CHAOWAN on 11/15/2016.
 */
import java.util.*;


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
    public boolean equals(int X,int Y){
        return (X==Y);
    }

    public void Append(StringBuffer x, StringBuffer y) {
        x.append(y);
    }

    public void reverse(){
        List xList = new ArrayList();
        Collections.reverse(xList);
    }

    public void reverseMe(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            System.out.printf("%s", iterator.previous());
        }
        System.out.println();
    }

    public void sortArray(int[] x){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i=1; i < x.length; i++){
                int temp= 0;
                if(x[i-1]>x[i]){
                    temp = x[i-1];
                    x[i-1]=x[i];
                    x[i] = temp;
                    swapped = true;
                }
            }
        }
    }

    public void sortMe(int[] x){
        int init[] = {};
        List list = new ArrayList(Arrays.asList(init));
        System.out.println("List befor:"+ list);
        Collections.sort(list);
        System.out.println("List after:" + list);
    }


}
