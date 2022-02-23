import java.util.Comparator;

public class Item implements Comparable<Item> {
    private double price;
    private String name;
    private String category;
    private int id;
    private int q;

    public static Comparator<Item> catComp() {
        return new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                return o1.category.compareTo(o2.category);
            }
        };
    }

    public Item(double price, String name, String category, int id, int q) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.id = id;
        this.q = q;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    @Override
    public String toString() {
        return "" +
                "p=" + price +
                ", n='" + name + '\'' +
                ", c='" + category + '\'' +
                ", i=" + id +
                ", q=" + q +
                "\n";
    }

    @Override
    public int compareTo(Item o) {
        // this > other  -> +1
        // this == other  -> 0
        // this < other  -> -1
        return (int)(this.price-o.price);
    }
    public static Comparator<Item> idComp() {
        return new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                return o1.id-o2.id;
            }
        };
    }
    public static Comparator<Item> nameComp() {
        NameComp n=new NameComp();
        return n;
    }
    public static Comparator<Item> qComp() {
        return new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                return o1.q-o2.q;
            }
        };
    }
    public static Comparator<Item> priceComp() {
        return new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                return (o1.compareTo(o2));
            }
        };
    }


    private static class NameComp implements Comparator<Item>{
        @Override
        public int compare(Item o1, Item o2) {
            return o1.getName().compareTo(o2.name);
        }
    }

}
