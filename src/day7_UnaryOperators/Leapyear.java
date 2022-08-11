package day7_UnaryOperators;

public class Leapyear {

    public static void main(String[] args) {
        int year = 2020;
        boolean leapYear = year%4<1;
        System.out.println(year+" is leapyear "+leapYear);

        int year2 = 2021;
        boolean leapYear2 = year2%4<1;
        System.out.println(year2+" is leapyear "+leapYear2);
        System.out.println("==============");
        int number = 65;
        boolean isDivisible2 = number%2<1;
        boolean isDivisible3 = number%3<1;
        boolean isDivisible5 = number%5<1;

        System.out.println(number+" is divisible by 2 "+isDivisible2);
        System.out.println(number+" is divisible by 3 "+isDivisible3);
        System.out.println(number+" is divisible by 5 "+isDivisible5);

        int year3 = 1990;
        boolean leapyear3 =year3%4<1;
        System.out.println(year3+" is leapyear "+leapyear3);

        System.out.println("===========");

        int year4 = 1998;
        boolean leapyear4 = year4%4<1;
        System.out.println(year4+" is leapyear "+leapyear4);

        int year5 = 2024;
        boolean leapyear5 = year5%4<1;

        System.out.println(year5+" is leapyear "+leapyear5);


    }

}
