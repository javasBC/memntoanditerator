import java.util.Comparator;

public class User  implements Comparable<User>{
    private String name;
    private String email;
    private int id ;

    //class XXXXXXX implements Comparator

    public static  Comparator <User> emailComparator(){
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        };
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(User other) {
        // this > other  -> +1
        // this == other  -> 0
        // this < other  -> -1
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return ""+name +" ^^ "+ email ;

    }
}
