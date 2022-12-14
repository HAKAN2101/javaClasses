package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        String str = "a1b2c3d4"; // 1=49, 2=50, 3=51
        int sum = 0;

        for (char each : str.toCharArray() ){
            if (Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);// each digits need to be converted to integer and added to the sum
            }
        }

        System.out.println("sum = " + sum);

        System.out.println("============================");
             String password = "Password#";
             String upperLetters = "";
             String lowerLetters = "";
             String digits = "";
             String specialChar = "";

             for (char each : password.toCharArray() ) {
                 if (Character.isUpperCase(each)) { // verify if the character is upper case
                     upperLetters += each;
                 } else if (Character.isLowerCase(each)) { // verify if the character is lower case
                     lowerLetters += each;
                 } else if (Character.isDigit(each)) { // verify if the character is digit
                     digits += each;
                 } else {// special character
                     specialChar += each;
                 }

             }

             System.out.println("upperLetters = "+ upperLetters);
             System.out.println("lowerLetters = "+ lowerLetters);
             System.out.println("digits = "+ digits);
             System.out.println("specialChar = " + specialChar);

             boolean isValid = password.length() >= 8 && upperLetters.length()>0 && lowerLetters.length() >0
                                                       && specialChar.length()>0 && digits.length()>0;

             System.out.println(isValid);


    }


}
