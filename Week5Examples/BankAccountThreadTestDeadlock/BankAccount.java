public class BankAccount
{
   // constructor
   public BankAccount(int initialAmount)
   {
      balance = initialAmount;
   }
   // method for depositing money
   public synchronized void deposit( double amount )
   {
      System.out.print( "Depositing " + amount );
      double newBalance = balance + amount;
      System.out.println( ", new balance is "
                           + newBalance );
      balance = newBalance;
   }
   // method for withdrawing money
   public synchronized void withdraw( double amount )
   {
      System.out.print( "Withdrawing " + amount );
      double newBalance = balance - amount;
      System.out.println( ", new balance is "
                           + newBalance );
      balance = newBalance;
   }
   // method for transferring money
   public synchronized void transfer( BankAccount to, double amount )
   {
      System.out.println( "Transferring " + amount );
      this.withdraw(amount);
      synchronized(to)
      {
        to.deposit(amount);
      }
   }
   // method for getting a balance
   public double getBalance()
   {
      return balance;
   }
   // instance variable
   private double balance;
}
