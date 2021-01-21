import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class testingcode {
    public static void main(String[] args) throws IOException {
        File fout = new File(
                "C:/Users/ttroxel21/Desktop/JAD_Final_Project/JAD-Final-Project/JAD Final Project/test.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < 10; i++) {
            bw.write("something");
            bw.newLine();
        }

        bw.close();

    }
}
