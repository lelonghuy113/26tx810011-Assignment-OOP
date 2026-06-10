package assignment.asm2.bai5.model;

import assignment.asm2.bai5.util.ProductValidator;

public class Product {
    private String productCode;
    private String name;
    private double price;
    private int quantity;
    private Category category;
    private boolean active;

    private static int counter = 1;
    private static int totalProducts = 0;
    private static double totalRevenue = 0;

    public Product() {
        this("Unknown", 0, 0);
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int quantity) {
        productCode = createCode();
        counter++;
        totalProducts++;

        active = true;
        category = new Category("General");

        if (ProductValidator.isValidName(name)) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }

        if (ProductValidator.isValidPrice(price)) {
            this.price = price;
        } else {
            this.price = 0;
        }

        if (ProductValidator.isValidQuantity(quantity)) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    private String createCode() {
        if (counter < 10) {
            return "P-000" + counter;
        } else if (counter < 100) {
            return "P-00" + counter;
        } else if (counter < 1000) {
            return "P-0" + counter;
        } else {
            return "P-" + counter;
        }
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Ten san pham khong hop le");
        }
    }

    public void setPrice(double price) {
        if (ProductValidator.isValidPrice(price)) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le");
        }
    }

    public void setQuantity(int quantity) {
        if (ProductValidator.isValidQuantity(quantity)) {
            this.quantity = quantity;
        } else {
            System.out.println("So luong khong hop le");
        }
    }

    public void setCategory(Category category) {
        if (category != null) {
            this.category = category;
        } else {
            System.out.println("Danh muc khong hop le");
        }
    }

    public void sell(int amount) {
        if (active && amount > 0 && amount <= quantity) {
            quantity = quantity - amount;
            totalRevenue = totalRevenue + amount * price;
            System.out.println("Ban hang thanh cong");
        } else {
            System.out.println("Khong the ban hang");
        }
    }

    public void restock(int amount) {
        if (active && amount > 0) {
            quantity = quantity + amount;
            System.out.println("Nhap hang thanh cong");
        } else {
            System.out.println("So luong nhap khong hop le");
        }
    }

    public void applyPromotion(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            price = price - price * discountPercent / 100;
        } else {
            System.out.println("Phan tram giam gia khong hop le");
        }
    }

    public static void applyGlobalPromotion(Product[] products, double discountPercent) {
        if (products != null) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    products[i].applyPromotion(discountPercent);
                }
            }
        }
    }

    public void discontinue() {
        active = false;
    }

    public void displayInfo() {
        System.out.println("Ma san pham: " + productCode);
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia: " + price);
        System.out.println("So luong: " + quantity);
        System.out.println("Danh muc: " + category.getName());
        System.out.println("Dang ban: " + active);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static String getStoreReport() {
        return "Tong so san pham da tao: " + totalProducts + ", Tong doanh thu: " + totalRevenue;
    }
}