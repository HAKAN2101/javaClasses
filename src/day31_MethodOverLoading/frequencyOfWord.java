package day31_MethodOverLoading;

import library.StringUtility;

import java.util.Locale;

public class frequencyOfWord {

    public static void main(String[] args) {
        String str = "Today is a great day, today we are learning java, today we have java class";

        int count = StringUtility.frequencyOfWord(str,"today");

        System.out.println(count);

        String str2 = "java JAVA jAvA c#, C# c# java java";
        int countJava = StringUtility.frequencyOfWord(str,"java");
        int countCSharp = StringUtility.frequencyOfWord(str,"c#");

        System.out.println("countJava = " + countJava);
        System.out.println("countCSharp = " + countCSharp);

        System.out.println("==============================");
        String sentence = "dog dog dog dog Dog DOG doG cat cat cat CAT";
        int countDog = StringUtility.frequencyOfWord(sentence,"dog");
        int countCat = StringUtility.frequencyOfWord(sentence,"cat");

        System.out.println("countDog = " + countDog);
        System.out.println("countCat = " + countCat);

        System.out.println( countCat == countDog );





    }

    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;


    }


}
