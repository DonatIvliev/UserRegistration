package Models;

public class User {
    public String fullName;
    public String email;
    public String password;


    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
}
