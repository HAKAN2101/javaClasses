package day34_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = "";    // A3B2C1D4E3

        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split(""))  );

    /*    for (String each : str.split("") ) { // we get every character from str and add them into arraylist so
            list.add(each);
        }

        System.out.println(list); */
        for (String each : list ){
            int frequency = Collections.frequency(list,each);

            if (!result.contains(each)) {
                result += each + frequency;
            }
        }

        System.out.println(result);





    }



}
