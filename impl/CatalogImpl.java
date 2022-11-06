package impl;

import java.util.List;

import api.Catalog;
import api.Product;

public class CatalogImpl implements Catalog {

    public List<Product> products;

    @Override
    public List<Product> getProducts() {
        return products;
    }

}
