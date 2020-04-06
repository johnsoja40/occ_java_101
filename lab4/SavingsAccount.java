/*
   name:       Jamie Johnson
   Assignment: Lab4
   Problem:    13
*/

public class SavingsAccount
{
  private double sbalance;
  private double ebalance;
  private double deposit;
  private double withdrawl;;
  private double irate;
  private double balance;

  public void set_sbal(double sbal)
  {
    sbalance = sbal;
  }

  public void set_ebal(double ebal)
  {
    ebalance = ebal;
  }

  public void set_deposit(double dep)
  {
    deposit = dep;
  }

  public void set_withdrawl(double w)
  {
      withdrawl = w;
  }

  public void set_irate(double i)
  {
    irate = i;
  }

  public double get_sbal()
  {
    return sbalance;
  }

  public double get_ebal()
  {
    return ebalance;
  }

  public double get_deposit()
  {
    return deposit;
  }

  public double get_withdrawl()
  {
    return withdrawl;
  }

  public double get_irate()
  {
    return irate;
  }

  public double calc_withdrawl()
  {
    return ebalance = sbalance - withdrawl;
  }

  public double calc_deposit()
  {
    return ebalance = sbalance + deposit;
  }
}
