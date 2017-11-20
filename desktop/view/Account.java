package view;

public class Account {

    String name = "";
    String username = "";
    String password = "";
    String email = "";
    String major = "";

    public Account(String name, String username, String password, String email, String major){
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
