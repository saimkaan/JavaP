import java.util.Date;

/**
 * Created by saim on 03/05/16.
 */
public class User {

    private String name;
    private String firstname;
    private String email;
    private Date date;

    public User(String name, String firstname, String email, Date date) {
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", '" + firstname + '\'' +
                ", '" + email + '\'' +
                ", " + date;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof User && email.equals(((User) obj).getEmail());
    }
}

