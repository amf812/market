package view;

public class Post {
    String description = "";
    String title = "";
    String userName = "";
    int price;

    public Post(String userName, String title, String description, int price){
        this.userName = userName;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getUserName() {
        return userName;
    }

    public int getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
