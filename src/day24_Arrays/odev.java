package day24_Arrays;

public class odev {

    public static void main(String[] args) {
        String str = "GUZEL HAYELLERIN GERCEKLESMESI JAVA ILE BASLAR";
        String[] arr = str.split(" ");

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String ch = arr[i];
            if (ch.contains("JAVA")){
                count++;
            }
        }
        System.out.println("JAVA nin sayisi: "+count);




    }





}
