package AndreeaG.teorie.seleniumbasics2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaExceptions {

    public static void main(String[] args) throws FileNotFoundException {
        checkedException();
        System.out.println( "Am executat functia main");
    }

    static void checkedException() throws FileNotFoundException {

        FileReader fileReader = new FileReader("C:\\Users\\redan\\IdeaProjects\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\AndreeaG\\teorie\\seleniumbasics2\\text.txt");

    }
}
