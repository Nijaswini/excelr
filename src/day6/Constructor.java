package day6;
class Product {
    int code;
    String name;
    double price;

    Product() {
        code = 0;
        name = "Not specified";
        price = 0.0;
    }

    Product(int code, String name) {
        this.code = code;
        this.name = name;
        price = 100.0;
    }

    Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(code + " | " + name + " | " + price);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(201, "Notebook");
        Product p3 = new Product(202, "Keyboard", 750.0);

        p1.display();
        p2.display();
        p3.display();
    }
}
