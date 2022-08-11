package day29_Methods;

public class MethodWithoutParameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("School Name");
        printHello5Times();

        MethodWithoutParameters.printHello5Times();

        System.out.print("Even Number: ");
        MethodsWithoutParameters2.printEvenNumbers1To100();

        System.out.print("Odd Number: ");
        MethodsWithoutParameters2.printOddNumbers1To100();

    }

    // AccessModifier specifier returnType MethodName (Parameter)
       public static void printHello5Times(){

        for (int i =1; i<6; i++){

            System.out.println("Hello");

        }

    }


}
