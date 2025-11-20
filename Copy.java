import java.io.*;

public class Copy {
    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream("input.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        int b;
        while ((b = fin.read()) != -1)
            fout.write(b);

        fin.close();
        fout.close();
    }
}
