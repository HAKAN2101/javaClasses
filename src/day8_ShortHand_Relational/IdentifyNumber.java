package day8_ShortHand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {
        int number = 200;
        boolean b1 = number < 0;
        boolean b2 = number > 0;
        boolean b3 = number == 0;

        System.out.println(number+ " is negative number "+b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("===================");
        int angle1 = 30;
        int angle2 = 30;
        int angle = 90;
        int sum = angle + angle1 + angle2;
        boolean isValid = sum == 180;

        System.out.println("The triangle is valid "+isValid);





    }

    /*
    number = 100
    output:
        100 is positive number : true
        100 is negative number : false
        200 is zero : false
     */

}
