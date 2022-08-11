package day30_ReturnMethods;

import library.StringUtility;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "aaabbbbcc";
        String result = ""; //a3b4c2

        String nonDup = StringUtility.removeDuplicates(str);    // a b c


        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str, ch);          // 3 4 2
            result += "" + ch + count;
        }

        System.out.println(result);

        System.out.println("====================================");

        String str2 = "aaaaaaaaabbbbbbbbbbbbbbccccccccccccccdddddddd";

        String result2 = frequencyOfCharactres(str2);

        System.out.println(result2);

    }

    public static String frequencyOfCharactres(String str){
        String result = ""; //a3b4c2

        String nonDup = StringUtility.removeDuplicates(str);    // a b c


        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str, ch);          // 3 4 2
            result += "" + ch + count;
        }

        return result;

    }



}
