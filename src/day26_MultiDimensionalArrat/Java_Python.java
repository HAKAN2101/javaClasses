package day26_MultiDimensionalArrat;

import java.util.Arrays;
import java.util.Locale;

public class Java_Python {

    public static void main(String[] args) {
        String sentences = "Java, Java, python python python java java Python";

        String[] words = sentences.split(" ");

        System.out.println(Arrays.toString(words));
        int countJava =0;
        int countPython = 0;

        for ( String each : words){
            if (each.toLowerCase().contains("java")){
                countJava++;
            }else if (each.toLowerCase().contains("python")){
                countPython++;
            }
        }

        System.out.println("Java: "+countJava);

        System.out.println("Python: "+countPython);

        System.out.println(countJava == countPython);




    }






}
