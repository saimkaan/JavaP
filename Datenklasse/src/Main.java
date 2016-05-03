import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by saim on 03/05/16.
 */
public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<User>();
        users.add(new User("Müller", "Michael", "m.müller@gmail.com", new Date()));
        users.add(new User("Baum", "Lea", "l.baum@gmail.com", new Date()));
        users.add(new User("Garten", "Dude", "d.garten@gmail.com", new Date()));
        users.add(new User("Eimer", "Heimer", "h.eimer@gmail.com", new Date()));
        users.add(new User("Baum", "Lea", "l.baum@gmail.com", new Date()));



        for (User u : users
             ) {
            System.out.println(u);
        }




    }
}
