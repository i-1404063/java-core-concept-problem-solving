package shoppingcart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {
        ShoppingCart<Product> cart = new ShoppingCart<>();
        List<Product> productList = new ArrayList<>();

        cart.add(new Product("machine", 43434));
        cart.add(new Product("body lotion", 600));
        cart.add(new Product("R1M", 400000));

        for (Product product : cart) {
            productList.add(product);
            System.out.println(product.getName() + "  " + product.getPrice());
        }

        // after sorted
        System.out.println("after sorted::");
        Collections.sort(productList);
        for (Product product : productList) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }

}
