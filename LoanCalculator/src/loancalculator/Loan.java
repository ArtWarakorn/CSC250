/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loancalculator;

/*
My ID : 6705263
My name : Warakorn junsongnean
*/

import java.text.DecimalFormat;

/**
 *
 * @author art
 */
public class Loan {
    
    private static final int MONTHS_IN_YEAR = 12;
    private double loanAmount, annualInterestRate;
    private double monthlyPayment, totalPayment;
    private double monthlyInterestRate;
    private int loanPeriod;
    private int numberOfPayments;
    
    public String txtAbountLoan(){
        return "This program computes the monthly and total\n"+
               "payments for a given loan amount, annual \n"+
               "interest rate, and loan period.\n"+
               "Loan amount in dollars and cents, e.g., 12345.50\n"+
               "Annual interest rate in percentage, e.g., 12.75\n"+
               "Loan period in number of years, e.g., 15\n\n";
                
    }
    
    public double calculateLoan(double myLoanAmount, double myAnnualInterestRate,int myLoanPeriod) {
        //set value
        loanAmount = myLoanAmount;
        annualInterestRate = myAnnualInterestRate;
        loanPeriod = myLoanPeriod;
        
        //compute the monthly and total payments
        monthlyInterestRate = myAnnualInterestRate / MONTHS_IN_YEAR / 100;
        numberOfPayments = myLoanPeriod * MONTHS_IN_YEAR;
        monthlyPayment = (myLoanAmount * monthlyInterestRate) /
        (1 - Math.pow(1/(1 + monthlyInterestRate),
        numberOfPayments ) );
        totalPayment = monthlyPayment * numberOfPayments;
        
        return totalPayment;
    }
    
    public String showResult() {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        return "\n"+
               "Loan Amount: $" + loanAmount + "\n"+
               "Annual Interest Rate: " + annualInterestRate + "%" + "\n" + 
               "Loan Period (years): " + loanPeriod + "\n" + "\n" + 
               "Monthly payment is $ " + df.format(monthlyPayment)+"\n"+
               "TOTAL payment is $ " + df.format(totalPayment);
    }
}
