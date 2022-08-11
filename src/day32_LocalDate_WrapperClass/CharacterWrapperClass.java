package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {
        char n = 'W';

        System.out.println( Character.isDigit(n) );
        System.out.println( Character.isLetter(n) );

        String str = "a1b2c3d4c5d6T@w$y%o^p%!-_+~`#& ";

        String digits = "";
        String letters = "";
        String specialChar = "";

        for ( char each : str.toCharArray() ){
            if (Character.isDigit(each)){
                digits += each;
            }else if (Character.isDigit(each)){
                letters += each;
            }else {
                specialChar += each;
            }

        }

        System.out.println("digitd = " +digits);
        System.out.println("letters = " +letters);
        System.out.println("specialChar + " +specialChar);


    }


}
