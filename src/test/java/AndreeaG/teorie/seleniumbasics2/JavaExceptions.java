package AndreeaG.teorie.seleniumbasics2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {

    public static void main(String[] args) throws IOException {
        //checkedException();
       // uncheckedException();
        //recursiv(5, 1);
        fun();
        System.out.println( "Am executat functia main");
    }

    static void checkedException() throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\redan\\IdeaProjects\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\AndreeaG\\teorie\\seleniumbasics2\\text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        fileReader.close();
    }
    static void uncheckedException(){
        int result= 0;
        try {
            int a = 5;
            int b = 3;
            result = a / b;
        } catch (NullPointerException e) {
           // System.out.println(e.getMessage());
           // System.out.println(e.getCause());
           // e.printStackTrace();
            System.out.println("catch1:  Nu se poate efectua impartirea la 0.");
        } finally {
            System.out.println("Am executat finally");
        }

        System.out.println( "Valoare impartire este: "+ result);

    }

    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught inside fun");
            throw e;// rethrowing the exception
        }
    }


    static void recursiv(int numar, int index) {
        if (numar !=0) {
            System.out.println(index);
            index ++;
            recursiv(numar, index);
        }
    }
}
