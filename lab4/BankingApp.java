/*
   name:       Jamie Johnson
   Assignment: Lab4
   Problem:    13
*/

import java.util.Scanner;
import java.io.*;

public class BankingApp
{
  public static void main(String[] args) throws IOException
  {
    double start_balance;
    double annual_interest_rate;
    double deposit_amount;
    double withdraw_amount;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter starting balance: $");
    start_balance = input.nextDouble();

    System.out.print("Enter annual interest rate: ");
    annual_interest_rate = input.nextDouble();

    SavingsAccount cust = new SavingsAccount(start_balance, annual_interest_rate);

    File deposits = new File("deposits.txt");
    Scanner deposits_file = new Scanner(deposits);

    while(deposits_file.hasNext())
    {
      double amount = deposits_file.nextDouble();
      cust.deposit(amount);
    }

    File withdraws = new File("withdraws.txt");
    Scanner withdraws_file = new Scanner(withdraws);

    while(withdraws_file.hasNext())
    {
      double amount = withdraws_file.nextDouble();
      cust.withdraw(amount);
    }

    cust.monthly_interest();

    System.out.printf("\nTotal interest earned: $%2.2f", cust.get_total_interest());
    System.out.printf("\nFinal account balance: $%2.2f\n\n", cust.get_balance());
  }
}
