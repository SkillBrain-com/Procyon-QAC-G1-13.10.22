package alinaTinca.teorie.seleniumbasicpart2;

import org.apache.commons.lang3.ObjectUtils;

import java.io.*;

public class JavaExceptions {

    public static void main(String[] args) throws IOException {
//        checkedExceptions();
//        uncheckedExceptions();
//        recursiv(5, 1);
        fun();
        System.out.println("Am executat functia main");
    }


    //Checked Exceptions
    static void checkedExceptions() throws IOException {
        //dupa ce am selectat Add... de la FileReader s-a adaugat throws iar ce este dupa se modifica de fiecare data   la crearea unui nou obiect
        FileReader fileReader = new FileReader("E:\\Alina work Git\\Git_Risingstars\\Procyon-QAC-G1-13.10.22\\src\\test\\java\\alinaTinca\\teorie\\seleniumbasicpart2\\text.txt");                                                                             //ctrl + b pt a deschide FileReader subliniat
        //cream un obiect de tipul FileReader pe care l am instantat cu constructorul sau
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine()); // metoda readLine() a preluat infoarmatia scrisa in fisierul text
        fileReader.close();
    }

    //Unchecked Exceptions

    static void uncheckedExceptions() {   //in cadrul acestei metode ne va da O EXCEPTIE (deci putem sa mai recuperam functionalitatea metodei)
        int result = 0;
        try {
            int a = 5;
            int b = 3;
            result = a / b;
        } catch (NullPointerException e) {      //e = numele parametrului ArithmeticException
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("Catch1: Nu se poate realiza impartirea lui 5 la 0");
        } finally {
            System.out.println("Am executat finally");
        }
        System.out.println("Valoarea impartirii este: " + result);
    }


    static void fun() {
        try {
            throw new NullPointerException("demo");    //aruncam o noua exceptie de tip Null...
        } catch (NullPointerException e) {              //in blocul catch ne prinde aceasta eroare
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception            //insa o aruncam din nou dupa ce am prins-o
            // si pt ca nu mai urmeaza alt CATCH o va printa la consola
        }
    }


    static void recursiv(int numar, int index){         //in cadrul acestei metode ne va da o EROARE
        if(numar !=0) {
            System.out.println(index);
            index++;
            recursiv(numar, index);
        }
    }
}
