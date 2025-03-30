
interface Product {
    String getName();

    double getPrice();

    String getDescription();
}

class RealProduct implements Product {
    private String name;
    private double price;
    private String description;

    public RealProduct(int id) {
        try {
            Thread.sleep(1000); // Simulating a delay for database retrieval
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

public class NoProxy {
    public static void main(String[] args) {
        // Create product 1
        Product p1 = new RealProduct(1);
        System.out.println("Name: " + p1.getName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Description: " + p1.getDescription());

        // Create product 1 (no cache)
        Product p2 = new RealProduct(1);
        System.out.println("Name: " + p2.getName());
        System.out.println("Price: " + p2.getPrice());
        System.out.println("Description: " + p2.getDescription());

        // Each product creation introduces a delay because there is no caching

        // Create product 2
        Product p3 = new RealProduct(2);
        System.out.println("Name: " + p3.getName());
        System.out.println("Price: " + p3.getPrice());
        System.out.println("Description: " + p3.getDescription());
    }
}