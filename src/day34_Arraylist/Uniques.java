package day34_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {
        String str = "aabaacddddefffffghhhhhi";

        ArrayList<Character> list = new ArrayList<>();

        for (char each : str.toCharArray() ) list.add(each);//getting each character from string and adding

        System.out.println(list);

        for (Character each : list ){
            if ( Collections.frequency(list, each) == 1){
                System.out.print(each);
            }
        }



    }


}
