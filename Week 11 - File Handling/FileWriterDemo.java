import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            writer.write("Jane Wanjiru, S13/00123/23, 78");
            writer.newLine();
            writer.write("Brian Otieno, S13/00456/23, 65");
            writer.newLine();
            writer.write("Faith Achieng, S13/00789/23, 82");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
