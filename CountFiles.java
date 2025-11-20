import java.io.*;

public class CountFiles {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        
        String line;
        int chars = 0, words = 0, lines = 0;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            words += line.split("\\s+").length;
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}

