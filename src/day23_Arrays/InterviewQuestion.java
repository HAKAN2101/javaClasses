package day23_Arrays;

public class InterviewQuestion {

    public static void main(String[] args) {

        String str = "AABBSDDAAZKML";
        String result = "";

        for (int j = 0; j <= str.length()-1; j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);
                if (ch == eachCharacter) {
                    count++;
                }
            }
            if ( count > 1){
                //result += ch;
                if (!result.contains(""+ch)){
                    result+= ""+ch;
                }
            }
        }
        System.out.println(result);


    }




}
