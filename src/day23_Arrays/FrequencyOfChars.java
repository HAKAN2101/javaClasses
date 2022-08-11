package day23_Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "BBCCDD"; //"A"
        String nonDop = "";  // "BCD"
        String result = "";  //"B2C2D2"

        for (int i = 0; i <= str.length()-1; i++){ // removing the duplicates from str
            String ch =""+ str.charAt(i); // B, B, C, C, D, D
            if (!nonDop.contains( ch )){
                nonDop += ch;
            }

        }

        System.out.println(nonDop);

        // str = "ABAB"              nonDup = "AB"

        for (int j=0; j <= nonDop.length()-1; j++){


            char ch = nonDop.charAt(0); // A
            int count = 0;
            for (int i = 0; i <= str.length()-1; i++){
                if (str.charAt(i) == ch){
                    count+=1;
                }
            }

            result += ""+ch + count;





        }

        System.out.println(result);






    }



}
