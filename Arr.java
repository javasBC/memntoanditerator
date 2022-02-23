import java.util.Iterator;

public class Arr  implements Iterable<Integer> {
    private int [] arr = new int [10];
    int index;

    public void add(int x){
        arr[index++]=x;
    }

    public int get (int i){
        return arr[i];
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
