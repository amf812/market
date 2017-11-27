package view;

public class Account {

    String name = "";
    String username = "";
    String password = "";
    String email = "";
    String securityQuestion;
    String securityAnswer;
    String major = "";

    public Account(String name, String username, String password, String email, String securityQuestion,
                   String securityAnswer, String major){
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSecurityQuestion() { return securityQuestion; }

    public String getSecurityAnswer() { return securityAnswer; }

    public String getMajor() {
        return major;
    }

}
