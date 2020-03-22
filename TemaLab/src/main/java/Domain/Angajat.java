package Domain;

public class Angajat {

    private String username;
    private String password;

    public Angajat(String username, String passworf) {
        this.username = username;
        this.password = passworf;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
