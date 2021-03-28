import domain.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        String path = "/Users/patrickalmeida/www/java-read-file/test-file.csv";

        List<Product> products = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();

            while(line != null) {
                String[] splitedLine = line.split(",");

                String name = splitedLine[0];
                Double price = Double.parseDouble(splitedLine[1]);
                Integer quantity = Integer.parseInt(splitedLine[2]);

                Product product = new Product(name, price, quantity);

                products.add(product);

                line = bufferedReader.readLine();
            }

            System.out.println("Products:");

            for (Product product : products) {
                System.out.println(product);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}
