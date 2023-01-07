package cosminsechel.teorie.seleniumbasicspart2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {

    public static void main(String[] args) throws IOException {
        checkedExceptions();
        System.out.println(" Am executat functia main");
    }
    // checked exceptions
    static void checkedExceptions() throws IOException {
        FileReader fileReader = new FileReader("D:\\GIT - PROCYON\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\cosminsechel\\teorie\\seleniumbasicspart2\\text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        fileReader.close();



    }
}
