import java.util.Comparator;

public class CategoryComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getCategory().compareTo(o2.getCategory());
        // String.compareTo(String)
    }
}
