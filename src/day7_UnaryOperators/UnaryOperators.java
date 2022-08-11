package day7_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = -100;
        boolean isPositive = a >= 0; // verify if a is positive
        boolean isNegative = a < 0; //verify if a is negative
        boolean isZero = a == 0;

        System.out.println(a+" is positive number: "+isPositive);
        System.out.println(a+" is negative number: "+isNegative);
        System.out.println(a+" is 0 "+isZero);

        int b = -100 - 20; // - 120
        System.out.println(b);

        int c = 10 - -20; // +
        // 10 +20 = 30

        int e  = 10 * -4; // -40
        int f = -10 * -4; // 40

        System.out.println("=======================");
        int x = 100;
        ++x; // increases the value by1, 100 +

        System.out.println(x);

        int z = 100;
        System.out.println( --z); //99

        int x2 = 100;
        System.out.println( ++x2); // 101

        System.out.println("=========================");

        int a2 = 100;
        System.out.println(a2++); // 100
        System.out.println( a2 );

        int b2 = 100;
        System.out.println(  b2-- ); // 100
        System.out.println(b2); //99

        System.out.println("====================");

        int b5 = 50;
        System.out.println( b5-- );
        System.out.println( b5--);
        System.out.println( +b5 );
        System.out.println( ++b5 );
        System.out.println( -b5 );
        System.out.println( --b5 );

    }


}
