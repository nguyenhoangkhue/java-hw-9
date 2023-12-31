package Main;

public class Store {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private int price;

    public Store(){
    }
    public Store(String id, String name, String description, int quantity, int price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return id+"-"+name+"-"+description+"-"+quantity+"-"+price;
    }
}
