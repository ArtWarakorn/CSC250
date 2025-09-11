package loancalculator;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author
 */
import java.util.Scanner;

/*
My ID : 6705263
My name : Warakorn junsongnean
*/

public class LoanCalculator {
    public static void main(String[] args){

        double loanAmount, annualInterestRate;
        int loanPeriod;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        
        //call class Loan
        Loan loan = new Loan();
        
        //describe the program
        System.out.println(loan.txtAbountLoan());
        
        //get input values
        System.out.print("Loan Amount (Dollars+Cents): ");
        loanAmount = scanner.nextDouble( );
        
        System.out.print("Annual Interest Rate (e.g., 9.5): ");
        annualInterestRate = scanner.nextDouble( );
        
        System.out.print("Loan Period - # of years: ");
        loanPeriod = scanner.nextInt( );
        //end get input value
        
        //call calculate loan method
        loan.calculateLoan(loanAmount, annualInterestRate, loanPeriod);

        //display the result
        System.out.println(loan.showResult());
    }
}
