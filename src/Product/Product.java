package Product;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    private String ProductName;
    private Double Price;
    private String ProductCategory;

    public Product(String productName, Double price, String productCategory) {
        ProductName = productName;
        Price = price;
        ProductCategory = productCategory;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(ProductName, product.ProductName) && Objects.equals(Price, product.Price) && Objects.equals(ProductCategory, product.ProductCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductName, Price, ProductCategory);
    }


    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }


}
