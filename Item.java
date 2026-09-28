package _AD004.demo.models;

public class Item {

    private int id;
    private String itemName;
    private String category;
    private String location;
    private String status;

    public Item() {
    }

    public Item(int id, String itemName, String category, String location, String status) {
        this.id = id;
        this.itemName = itemName;
        this.category = category;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}