package view;

public class Post {
    String description = "";
    Object category = "";
    String title = "";
    String userName = "";
    String price;

    public Post(String userName, Object category, String title, String description, String price){
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public String getPrice() {
        return price;
    }

    public void setCategory(Object category) { this.category = category; }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
