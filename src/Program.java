import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        File file = new File("/Users/patrickalmeida/www/java-read-file/test-file.csv");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(Objects.nonNull(scanner)) {
                scanner.close();
            }
        }
    }

}
