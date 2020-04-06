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

    File deposits = new File("deposits.txt");
    Scanner deposit_file = new Scanner(deposits);

    File withdrawls = new File("withdrawls.txt");
    Scanner withdrawl_file = new Scanner(withdrawls);

    SavingsAccount cust_num = new SavingsAccount();
    cust_num.set_sbal(1300.00);
    cust_num.set_withdrawl(100.00);
    cust_num.set_deposit(500.00);
    // cust_num.set(11);
    // cust_num.set(8);

    System.out.println("The customer's account balance is: " + cust_num.get_sbal());
    System.out.println("Ending balance after withdrwal is: " + cust_num.calc_withdrawl());
    System.out.println("Ending balance after deposit is: " + cust_num.calc_deposit());
    System.out.println("The customer's account balance is: " + cust_num.get_ebal());
    // System.out.println("The Cube's width is: " + red.getWidth());
    // System.out.println("The Cube's height is: " + red.getHeight());
  }
}
