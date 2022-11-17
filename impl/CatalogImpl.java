package impl;

import java.util.List;

import api.Catalog;
import api.Product;

public class CatalogImpl implements Catalog {

    public List<Product> products;
    
    public CatalogImpl() {
        Product p1 = new Product();
        products.add(p1);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

}
