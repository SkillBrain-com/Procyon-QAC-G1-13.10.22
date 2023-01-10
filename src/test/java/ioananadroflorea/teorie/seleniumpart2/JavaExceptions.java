package ioananadroflorea.teorie.seleniumpart2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {

    public static void main(String[] args) throws IOException {
//        uncheckedExceptions();
//        checkedExceptions();
//        recursiv(5);
//        fun();
//        System.out.println("Te-am executat!");
    }

    //checked exceptions
    static void checkedExceptions() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\40742\\IdeaProjects\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\ioananadroflorea\\teorie\\seleniumpart2\\text.txt");
        BufferedReader citesteDinFisier = new BufferedReader(fileReader);
        System.out.println(citesteDinFisier.readLine());
        fileReader.close();
    }

    //unchecked exceptions
    static void uncheckedExceptions(){
        int result = 0;
        try {
        int a = 5;
        int b = 3;
        result = a / b;
    }catch (NullPointerException e){
            System.out.println("Catch: NU se poate efectua impartirea la 0.");
        } catch (ArithmeticException e){
            System.out.println("catch 2.");
        } finally {
            System.out.println("Am executat finally.");
        }
        System.out.println("Rezultatul este: " + result);
    }
    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    static void recursiv(int numar){
        if(numar!=0){
            recursiv(numar);
        }
    }
}
