package assignment.asm2.bai5.model;

import assignment.asm2.bai5.util.ProductValidator;

public class Category {
    private String name;

    public Category(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        } else {
            this.name = "General";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Ten danh muc khong hop le");
        }
    }
}