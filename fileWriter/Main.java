package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nidk");
            writer.append("\n(A poem by me)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
