package impl;

import java.util.List;

import api.Product;
import api.ShoppingCart;

public class ShoppingCartImpl implements ShoppingCart {

    public List<Product> contents;

    @Override
    public boolean add(Product product) {
        boolean alreadyContains = false;
        for(Product content : contents) {
            if(content.getName() == product.getName()) {
                alreadyContains = true;
            }
        }
        if(alreadyContains) {
            return false;
        } else {
            contents.add(product);
        }
        return true;
    }

    @Override
    public boolean remove(Product product) {
        for(Product content : contents) {
            if(content.getName() == product.getName()) {
                contents.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> get() {
        return contents;
    }

}
