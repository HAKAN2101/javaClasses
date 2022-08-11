package day25_Practices;

import java.util.Arrays;

public class ConbineToArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,54,67,89,112,334,};
        int[] arr2 = {4,5,3,4,5,6,7,889,};

        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size]; // 5

        /*
        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];

          arr3[3] = arr2[0];
          arr3[4] = arr2[1];

         */

        int index = 0;
        for (int each: arr1){
            arr3[index] = each;
            index += 1;
        }

        for (int each: arr2){
            arr3[index] = each;
            index++;
        }



        System.out.println(Arrays.toString(arr3) );

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3) );

        System.out.println("Maximum: "+arr3[arr3.length-1]);

        System.out.println("Minimum: "+arr3[0]);




    }



}
