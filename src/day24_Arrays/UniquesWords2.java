package day24_Arrays;

public class UniquesWords2 {

    public static void main(String[] args) {
        String[] words ={"C#","C#","Java","Python","Python","C++","Ruby"};

        for (String each: words){

            int count = 0;
            for (String b : words ) { // b represents each elements in the array
                if (each.equals(b)) {
                    count++;
                }
            }

            if (count == 1){
                System.out.println(each);
            }
        }

        System.out.println("===================");

        String s1 ="Bugun Hawaii'de hava cok guzel northshore'a gidip mangal yapalim";
        String[] arr = s1.split("");
        int count=0;

        for (String each: arr){
            if (each.contains("a")){
                count++;
            }
        }
        System.out.println(count);






    }





}
