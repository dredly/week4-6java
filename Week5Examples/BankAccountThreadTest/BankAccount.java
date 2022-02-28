public class BankAccount
{
   // default constructor
   public BankAccount()
   {
      balance = 0;
   }
   // method for depositing money
   public void deposit( double amount )
   {
      System.out.print( "Depositing " + amount );
      double newBalance = balance + amount;
      System.out.println( ", new balance is "
                           + newBalance );
      balance = newBalance;
   }
   // method for withdrawing money
   public void withdraw( double amount )
   {
      System.out.print( "Withdrawing " + amount );
      double newBalance = balance - amount;
      System.out.println( ", new balance is "
                           + newBalance );
      balance = newBalance;
   }
   // method for getting a balance
   public double getBalance()
   {
      return balance;
   }
   // instance variable
   private double balance;
}
