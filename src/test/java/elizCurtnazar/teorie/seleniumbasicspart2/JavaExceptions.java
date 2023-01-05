package elizCurtnazar.teorie.seleniumbasicspart2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {

    public static void main(String[] args) throws IOException {
       // checkedExceptions();
       //ucheckedException();
   //   recursiv(5, 3);
        fun();



        System.out.println("Am executat functia main");
    }

    //checked exceptions //ctrl+b
    static void checkedExceptions() throws IOException {
        FileReader fileReader = new FileReader("D:\\git procyon\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\elizCurtnazar\\teorie\\seleniumbasicspart2\\text.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        System.out.println(bufferReader.readLine());
        fileReader.close();

    }

    //unchecked exceptions
    static void uncheckedException() {
        int result = 0;
        try {
            int a = 5;
            int b = 0;
            result = a / b;
        } catch ( NullPointerException | ArithmeticException e){
            // System.out.println(e.getMessage());
            //System.out.println(e.getCause());
            //e.printStackTrace();
            System.out.println("Nu se poate efectua impartirea la 0.");
        } finally {
            {
                System.out.println("Am exeutat finally ");
            }
        }

        System.out.println("Valoarea impartirii este: " + result);
    }



    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
}



    static void recursiv(int numar, int index) {
        if (numar !=0){
            System.out.println(index);
            index++;

            recursiv(numar,index);
        }
    }


}