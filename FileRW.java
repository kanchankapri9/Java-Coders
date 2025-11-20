import java.io.*;

public class FileRW {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("abc.txt");
        fw.write("Hello Kanchan");
        fw.close();

        FileReader fr = new FileReader("abc.txt");
        int ch;
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
    }
}
