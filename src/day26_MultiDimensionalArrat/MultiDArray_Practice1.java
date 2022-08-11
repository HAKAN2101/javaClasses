package day26_MultiDimensionalArrat;

import java.util.Arrays;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {

        /*
        testers: {"Liliia", "Odins", "Critina","Elkem" }

        Developers: {"Ahmet", "Erfan", "Roza", "Sarah"}
        SM: {"Nurmamet"}
        PO: {"Nadir"}
        BA: {"Alex"}

        scrumTEam: testers, Developer, SM, PO,BA

         */

        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

               String[] testers2 = {"Irene","Aslan", "Nazar"};

        String[][] scrumTeam = {testers, developers,SM,PO,BA};
                       //          0          1      2  3  4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0]= testers2;
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));

        for (String[] each: scrumTeam ) {
            for (String name : each) {
                System.out.println(name);
            }
        }
            /*
            System.out.println( Arrays.toString(each) );
            */

            System.out.println("=================================");

            int[][] scores = { {10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135} };
            // print out the numbers that are divisible by 3 0r 5

            for ( int[] each1: scores ){
                for (int point : each1){
                    if (((point % 3) == 0) && ((point % 5) == 0)){
                        System.out.println(point);
                    }
                }
            }










    }






}
