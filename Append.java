import java.io.*;

public class Append {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write("\nNew Line Added!");
        fw.close();
    }
}
