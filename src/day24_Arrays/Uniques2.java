package day24_Arrays;

public class Uniques2 {

    public static void main(String[] args) {

        String str = "aab[ploiuytrewlkjhgfdllikujyhtrcc";

        String expectedResult = ""; // "b

        for (int j = 0; j <= str.length()-1; j++) {

            char ch1 = str.charAt(j); // a a b c c
            int count1 = 0; // 1+1 // frequency of ch

            for (int i = 0; i <= str.length() - 1; i++) { // used for finding the frequency of ch and assign
                char each = str.charAt(i); // a a b c c
                if (ch1 == each) {
                    count1 += 1;
                }
            }

            if (count1 == 1) { // if it only occured one time
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);









}}
