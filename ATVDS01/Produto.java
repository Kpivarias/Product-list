public class Produto {
    private int code;
    private int stock;
    private String type;
    private String name;
    private double price;

    public Produto(int code, int stock, String type, String name, double price) {
        this.code = code;
        this.stock = stock;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: " + type + ", Price: " + price + ", Stock: " + stock;
    }
}