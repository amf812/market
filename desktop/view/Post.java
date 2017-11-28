package view;

public class Post {
    String description = "";
    Object category = "";
    String title = "";
    String email = "";
    String price;

    public Post(String email, Object category, String title, String description, String price){
        this.email = email;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public Object getCategory() { return category; }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPrice() {
        return price;
    }
}
