import java.io.*;

public class FileExist {
    public static void main(String[] args) {
        File f = new File("abc.txt");

        if (f.exists()) {
            System.out.println("Exists");
            System.out.println(f.getName());
            System.out.println(f.getPath());
            System.out.println(f.length());
        } else {
            System.out.println("File not found!");
        }
    }
}
