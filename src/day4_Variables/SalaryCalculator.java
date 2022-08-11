package day4_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {


        double salary = 100000;
        double tax = salary * 0.28;

        double salaryAfterTax = salary - tax;

        System.out.println("Salary after tax is :");
        System.out.println(salaryAfterTax);



    }

}
