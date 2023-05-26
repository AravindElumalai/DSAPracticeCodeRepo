import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesRead {
    public static void main(String[] args) {
        File file = new File("C:\\DataStructures\\demo.txt");
        try (FileReader fr = new FileReader(file)) {
            BufferedReader redr = new BufferedReader(fr);
            String line = redr.readLine();
            while (line != null) {
                System.out.println(line);
                if (line.contains("India")) {
                    System.out.println("Line country ");
                }
                line = redr.readLine();
            }
            redr.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
