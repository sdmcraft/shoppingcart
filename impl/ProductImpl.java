package impl;

import api.Product;

public class ProductImpl implements Product {

    public String name;
    public int id;
    public int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
