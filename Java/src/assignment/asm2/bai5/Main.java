package assignment.asm2.bai5;

import assignment.asm2.bai5.model.Category;
import assignment.asm2.bai5.model.Product;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Sua", 25000);
        Product p3 = new Product("Gao", 18000, 20);
        Product p4 = new Product("But", 5000, 100);

        p2.setCategory(new Category("Thuc pham"));
        p3.setCategory(new Category("Thuc pham"));
        p4.setCategory(new Category("Van phong pham"));

        p2.restock(30);
        p2.sell(5);

        p3.sell(3);
        p4.sell(10);

        p4.applyPromotion(10);

        Product[] list = {p1, p2, p3, p4};
        Product.applyGlobalPromotion(list, 5);

        p3.discontinue();

        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        p3.displayInfo();
        System.out.println();

        p4.displayInfo();
        System.out.println();

        System.out.println(Product.getStoreReport());
    }
}