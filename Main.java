import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import api.Product;
import impl.CatalogImpl;
import impl.ProductImpl;
import impl.ShoppingCartImpl;

public class Main {
    public static void main(String[] args) {

        CatalogImpl catalog = buildCatalog();
        ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
        shoppingCart.contents = new ArrayList<>();

        Scanner command = new Scanner(System.in);

        System.out.println("Enter command: ");
        boolean running = true;

        while (running) {
            String action = command.nextLine();
            String task = action.split(",")[0];
            System.out.println(task);
            switch (task) {
                case "add":
                    int id = Integer.parseInt(action.split(",")[1]);
                    Product p = find(catalog, id);
                    shoppingCart.contents.add(p);
                    System.out.println("Product Added!");
                    break;

                case "remove":
                    id = Integer.parseInt(action.split(",")[1]);
                    p = find(catalog, id);
                    shoppingCart.contents.remove(p);
                    System.out.println("Product removed!");
                    break;

                case "show":
                    for (Product prd : shoppingCart.contents) {
                        System.out.println(prd.getName());
                    }
                    break;

                case "exit":
                    System.out.println("Application Closed");
                    running = false;
                    break;

                default:
                    System.out.println("Command not recognized!");
                    break;
            }
        }
        command.close();

    }

    private static Product find(CatalogImpl catalog, int id) {
        Product result = null;
        for (Product p : catalog.products) {
            if (p.getId() == id) {
                result = p;
            }
        }
        return result;
    }

    private static CatalogImpl buildCatalog() {
        ProductImpl p1 = new ProductImpl();
        p1.id = 1;
        p1.name = "Product-1";
        p1.price = 100;

        ProductImpl p2 = new ProductImpl();
        p2.id = 2;
        p2.name = "Product-2";
        p2.price = 200;

        ProductImpl p3 = new ProductImpl();
        p3.id = 3;
        p3.name = "Product-3";
        p3.price = 300;

        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        CatalogImpl catalog = new CatalogImpl();
        catalog.products = list;

        return catalog;
    }
}
