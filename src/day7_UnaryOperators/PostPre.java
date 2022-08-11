package day7_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {
        int x = 2;
        int y = x++; // post increment: first passes current value 2

        System.out.println(x); //3
        System.out.println(y); //2

        System.out.println("================================");
        int x2 = 2;
        System.out.println( x2++); //2
        System.out.println(x2); //3

        System.out.println("===================================");
        int x3 = 2;
        System.out.println(--x3);

        System.out.println("====================================");
        int x4 = 8;
        int y4 = x4--; // y4 = 8,

        System.out.println(y4); //8
        System.out.println(x4); //7

        System.out.println("==========================================");

        int a = 1; // a=0

        int b = -a-- + a++ / -a-- * --a;
        // b = -1 + 0 / -1 * -1
        // b = -1 + 0 * -1
        // b = -1 + 0 =-1

        System.out.println(b);

        System.out.println("=========================");

        int A = 50;
        int B = --A + A++ + A-- + A++ ;


        System.out.println(B);

        System.out.println("================");

        int X = 4;
        int Y = X * 4 - X++;
        // Y = 4 * 4 - 4
        // Y = 16 - 4 = 12

        System.out.println(Y);

        System.out.println("==================");

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //  p = - 101 * -101 / 100 + 100
        //  p = 10201 / 100 + 100
        //  p = 102 + 100
        //  p = 202

        System.out.println(p);

        System.out.println("=================");
        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        // W = -20 + -19 + 19 * 19
        // W =

    }

}
