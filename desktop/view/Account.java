package view;

public class Account {

    String name = "";
    String username = "";
    String password = "";
    String email = "";
    String securityQuestion;
    String securityAnswer;
    String major = "";

    Account test = new Account("Alex", "amf812","test", "test@test.com",
            "What college do you go to?", "GVSU");

    public Account(String name, String username, String password, String email, String securityQuestion,
                   String securityAnswer){
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
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
