public class DepositThread extends Thread
{
   // DepositThread constructor
   public DepositThread( BankAccount anAccount,
                                       double anAmount )
   {
      account = anAccount;
      amount = anAmount;
   }
   // this method is executed when the thread is started
   public void run()
   {
      try
      {
         for ( int i = 0;
            i <= REPETITIONS && ! isInterrupted(); i++ )
         {
            // deposit money into account
            account.deposit( amount );
            // sleep for 5 milliseconds
            Thread.sleep( DELAY );
         }
      }
      // exception generated if sleeping thread is
      // interrupted
      catch ( InterruptedException ie )
      {
         System.out.println(
                        "Interrupted while sleeping" );
      }
   }
   // instance variables
   private BankAccount account;
   private double amount;
   // constants
   private static final int REPETITIONS = 500;
   private static final int DELAY = 5;
}

