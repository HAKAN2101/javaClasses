package day6_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double fedarelTax = salary * federalTaxRate;
        double totalTax = stateTax * fedarelTax;
        double salaryAfterTax = salary - totalTax;


        System.out.println("your salary is:"+salary);
        System.out.println("");

        double salary2 = 200000;
        double stateTaxRate2 = 0.9;
        double federalTaxRate2 = 0.34;
        double stateTax2 = salary2 * stateTaxRate2;
        double federalTax2 = salary2 * federalTaxRate2;
        double totalTax2 = stateTax2 * federalTax2;
        double salarayAfterTax = salary2 - totalTax2;

        System.out.println("\tyour salary is "+salary2);
        System.out.println("\ntotal tax is "+totalTax2);
        System.out.println("\nSalary after tax is "+salarayAfterTax);

    }

}
