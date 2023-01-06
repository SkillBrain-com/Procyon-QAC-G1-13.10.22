package alinaTinca.teorie.CursTimeea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaErrors {
    public static void main(String[] args) throws IOException {
        //throw - use it for throw an error
        //throws - attention that a method or a constructor throws any error or exception
        //try - catch - finally - code blocks  where use any Handle for our error or exceptions

//        checkExceptions();
//        uncheckExceptions();
//        metodaRecursiva(5);
//        System.out.println("S-a terminat metoda main");

        try{
            String word = null;
            String result = word.toLowerCase();
            System.out.println("Rezultatul este: " + result);
        }catch (NullPointerException e) {
            System.out.println("Am intrat in blocul de catch");
        }

        System.out.println("S-a terminat metoda main");
    }



    //checked exceptions - Are caught at the compilation moment
    public static void checkExceptions() throws IOException {
        FileReader fileReader = new FileReader("E:\\Alina work Git\\Git_Risingstars\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\alinaTinca\\teorie\\CursTimeea\\text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //BufferedReader = obiect pt citirea unei informatii
        System.out.println(bufferedReader.readLine());
        //readLine() - afiseaza la consola informatia
        fileReader.close();
    }


    //unchecked exceptions - Are caught on during the program running (RingTime)
    public static void uncheckExceptions(){
        //NullPointerException - shows, for example, for the LENGHT of any word
//        String word = null;
//        word.length();


        //ArithmeticException - shows, for example, for the / at 0
        int a=10;
        int b=0;
        int result=a/b;
        System.out.print("Rezultatul este: " + result);
    }

    public static void metodaRecursiva(int numar) {
        if (numar==0){
            return;
        } else{
            metodaRecursiva(numar);
        }
    }



}
