package day25_Practices;

public class ShothestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam","Nickolas","Amir","Nurmamet","Tony","Adam","Musa","Alan"};

        int minLength = arr[0].length(); //3

        for (String each: arr){
            int l = each.length(); // 4 8 4 8

            if (l < minLength){ // to find out the minimum length of the string in arr
                minLength = l;
            }
        }

        for (String each : arr){// to see how many strings lengths in the array is maximum
            if (each.length() == minLength){
                System.out.println(each);
            }
        }






    }





}
