package day30_ReturnMethods;
import library.StringUtility;
import library.ArraysUtility;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        String str = "Level";

        String reversedName = StringUtility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaaabbbccccddeeee";
        String result2 = StringUtility.removeDuplicates(str2);
        System.out.println(result2);

        String str3 = "aaabcccdeee";
        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

        System.out.println("===============================");

        String s1 = "ccccccccbbbbbbbbbaaaaaaaaaa";
        String s2 = "bbbbbbbbbaaaaaaaaaacd";

        boolean r1 = StringUtility.isAnagram(s1,s2);

        System.out.println(r1);

        System.out.println("====================================");


        int[] array = {1, 0, -2, 30, 40, 500, -20, -50};

        int[] descending = ArraysUtility.sort(array);

        System.out.println(Arrays.toString(descending));

        System.out.println(ArraysUtility.printArray(descending));

    }


}
