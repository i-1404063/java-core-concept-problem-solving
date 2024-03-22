package shoppingcart;

public class Product implements Comparable<Product> {

    private String name;
    private double price;

    public Product(String _name, double _price) {
        this.name = _name;
        this.price = _price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
