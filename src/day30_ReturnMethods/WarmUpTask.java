package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {

        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-10);

        System.out.println("==========================================");

        int[] numbers = {1,2,3,4,-5, -6, -7, -8, 10, 11, 0};

        for (int i =0; i <= numbers.length-1; i++){
            positiveNegativeZero(numbers[i] );
        }

        System.out.println("====================");

        gradeCalculator(85);

       // positiveNegativeZero(-120);
        gradeCalculator(-120);

        System.out.println("===================================");
        int[] a1 = {10,50, 60, 70};
        int[] a2 = {20, 90, 100};

        combineTwoArrays(a1, a2);

        System.out.println("===============================================");
        withoutDuplicates("aaaaaaaabbbbbbbcccdddddaabbbb");

        String str = "ppppoooooooiiiiiiuuuuyyyytttt";
        withoutDuplicates(str);

        System.out.println("====================================");

        formattedFullName("cyBERtek", "School");


    }

    //task1:
    public static void positiveNegativeZero(int number){
        String result = (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(number+" is "+result);

    }

    //task2:
    public static void gradeCalculator(int score){
        if (score >= 0 && score <= 100){

            if (score>= 90){
                System.out.println("A");
            }else if (score>=80){
                System.out.println("B");
            }else if (score >= 70){
                System.out.println("C");
            }else if (score>= 60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }

        //    System.out.println( (score >= 90)? 'A' : (score>=80)? 'B' :(score>=70)? 'C' :(score>=60)?'D':'F' );

        }else {
            System.err.println("Invalid Score");
        }
    }

    //task3:                               {1,2}      {1,2,3}
    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0; // represents the index nums of arr3

        for (int each : arr1){
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for (int each : arr2){
            arr3[i++] = each;//each elements of arr2 is being assigned to the index of third array
        }

        System.out.println(Arrays.toString(arr3) );

    }

    //task4:                             "aabcc"
    public static void withoutDuplicates(String str){
        String result = ""; //"abc// "
/*
        for (String each : str.split("") ){ // each : [a, a, b, c, c, b]
            if (!result.contains( ""+each )){
                continue;
            }else {
                result += each;
            }

        } */

        for (int i = 0; i <= str.length()-1; i++ ){
            if (!result.contains(""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        System.out.println( result );

    }

    //task5:                             // "cYbErTeK" ,
    public static void formattedFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase(); // "Cybertek"
        last =last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();    // School

        String fullName = first + " " + last;

        System.out.println(fullName);



    }



}
