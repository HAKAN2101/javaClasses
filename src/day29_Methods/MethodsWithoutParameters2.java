package day29_Methods;

public class MethodsWithoutParameters2 {

    public static void main(String[] args) {

        printOddNumbers1To100();

        printEvenNumbers1To100();



    }

    public static void printOddNumbers1To100(){

        for (int i=1; i <= 100; i++){
            if (i%2 !=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }

    public static void printEvenNumbers1To100(){
        for (int i=1; i <= 100; i++){
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



}

/*
void method without parameter
void method with parameter

return method with and without parameters
 */