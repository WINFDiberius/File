package Product;

import java.io.File;

public class ProductDemo {

    public static void main(String[] args) {

        Product schnitzel = new Product("Wiener", 18.0, "Fleisch");
        Product kebap = new Product("Alis", 5.0, "Fleisch");

        ProductManager franz = new ProductManager();

        franz.add(schnitzel);
        franz.add(kebap);

        franz.save("C:\\Campus02\\Java\\ErweiterteThemenDerSoftwareEntwicklung\\Download\\dokumente\\demo.dat");


    }


}
