import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

// Subject
interface Product {
    String getName();

    double getPrice();

    String getDescription();
}

// Real Subject
class RealProduct implements Product {
    private String name;
    private double price;
    private String description;

    public RealProduct(int id) {
        try {
            Thread.sleep(1000); // Database query simulation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = "Product " + id;
        this.price = 100.0 + id;
        this.description = "Description for Product " + id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

// Proxy
class ProductProxy implements Product {
    private static final HashMap<Integer, Product> cache = new HashMap<>();
    private static final ReentrantLock lock = new ReentrantLock();
    private int id;

    public ProductProxy(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return getProduct().getName();
    }

    @Override
    public double getPrice() {
        return getProduct().getPrice();
    }

    @Override
    public String getDescription() {
        return getProduct().getDescription();
    }

    private Product getProduct() {
        lock.lock();
        try {
            if (!cache.containsKey(id)) {
                cache.put(id, new RealProduct(id));
            }
            return cache.get(id);
        } finally {
            lock.unlock();
        }
    }
}

// Client
public class Proxy {
    public static void main(String[] args) {
        Product p1 = new ProductProxy(1);
        System.out.println("Name: " + p1.getName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Description: " + p1.getDescription());

        Product p2 = new ProductProxy(1);
        System.out.println("Name: " + p2.getName());
        System.out.println("Price: " + p2.getPrice());
        System.out.println("Description: " + p2.getDescription());

        // The code above has no delay because it's retrieved from cache

        Product p3 = new ProductProxy(2);
        System.out.println("Name: " + p3.getName());
        System.out.println("Price: " + p3.getPrice());
        System.out.println("Description: " + p3.getDescription());
    }
}
