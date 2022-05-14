package ir.edu.farhadi.java.j18.Annotations.values;

public class Product {
    @Validation(min = 0, max = 50000)
    private double price;
    private String name;
    private int code;


    @PolicyCheck(user = "Admin")
    private void saveProduct() {
        System.out.println("The Product was saved");
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
