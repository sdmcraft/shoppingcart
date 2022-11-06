package api;
import java.util.List;

public interface ShoppingCart {
    boolean add(Product product);
    boolean remove(Product product);
    List<Product> get();
}