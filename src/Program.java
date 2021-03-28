import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        String path = "/Users/patrickalmeida/www/java-read-file/test-file.csv";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
