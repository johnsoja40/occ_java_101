/*
   name:       Jamie Johnson
   Assignment: Lab4
   Problem:    13
*/

public class SavingsAccount
{
  private double balance;
  private double annual_interest_rate;
  private int months;
  private double total_deposits;
  private double total_withdraws;;
  private double total_interest;

  public SavingsAccount(double start_balance, double annual_interest_rate, int months)
  {
    balance = start_balance;
    this.annual_interest_rate = annual_interest_rate / 100;
    this.months = months;
  }

  public void deposit(double amount)
  {
    balance += amount;
    total_deposits += amount;
  }

  public void withdraw(double amount)
  {
    balance -= amount;
    total_withdraws += amount;
  }

  public void monthly_interest()
  {
    double monthly_interest = balance * get_monthly_interest_rate();
    total_interest += monthly_interest;
    balance += monthly_interest;
  }

  public double get_balance()
  {
    return balance;
  }

  public double get_monthly_interest_rate()
  {
    return annual_interest_rate / months;
  }

  public double get_total_interest()
  {
    return total_interest;
  }
}
