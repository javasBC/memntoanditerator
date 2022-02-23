import java.util.Comparator;

public class EmailComparator  implements Comparator<User> {

    @Override
    public int compare(User user1, User user2 ) {
        return user1.getEmail().compareTo(user2.getEmail());
    }
}
