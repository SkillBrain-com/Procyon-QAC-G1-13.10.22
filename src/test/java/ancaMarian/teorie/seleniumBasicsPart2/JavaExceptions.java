package ancaMarian.teorie.seleniumBasicsPart2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {
    public static void main(String[] args) throws IOException {
//        checkedExceptions();
//
//        uncheckedException();
//        recursiv(5, 1);
        fun();
        System.out.println("am executat functia main");
    }

//checked exceptions
    static void checkedExceptions() throws IOException {
        FileReader fileReader = new FileReader("/Users/ancapatriciamarian/Desktop/procyon/src/test/java/ancaMarian/teorie/seleniumBasicsPart2/text.txt"); //stringul e gol deci va da eroare
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        fileReader.close(); //ca nu ne ramana procesul deschis si sa ne dea exceptii daca vom incerca sa il deschidem din nou
    }

//unchecked exceptions
    static void uncheckedException() {
        int result = 0;
        try {
            int a = 5;
            int b = 0;
            result = a / b;
        } catch (NullPointerException | ArithmeticException e) { //insiruire de exceptii
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace(); //ne arata cu rosu eroarea,dar obtinem exit code 0
            System.out.println("catch1: nu se poate efectua impartirea la 0");
        } finally {
            System.out.println("am executat finally");

        }
//        catch (ArithmeticException e) {
//            System.out.println("catch 2: nu se poate efectua impartirea la 0");
//        }
    }
//        System.out.println("valoarea impartiriii este: " + result);



    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

//        static void recursiv(int numar, int index) { //va itera pana ajunge la eroare
//            if(numar !=0) {
//                System.out.println(index);
//                index++;
//                recursiv(numar, index);
//            }
//        }




}
