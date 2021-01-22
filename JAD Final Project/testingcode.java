import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class testingcode {
    public static void main(String[] args) throws IOException {

        List<String> fileContent = new ArrayList<>(Files
                .readAllLines(Paths.get("C:/Users/ttroxel21/Desktop/New folder/test2.txt"), StandardCharsets.UTF_8));

        for (int i = 0; i < fileContent.size(); i++) {
            if (fileContent.get(i).equals("old line")) {
                fileContent.set(i, "new line");

            }
        }
        Files.write(Paths.get("C:/Users/ttroxel21/Desktop/New folder/test2.txt"), fileContent, StandardCharsets.UTF_8);
    }
}
