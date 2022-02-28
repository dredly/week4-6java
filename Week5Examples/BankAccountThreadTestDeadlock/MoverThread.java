public class MoverThread extends Thread
{
   // MoverThread constructor
   public MoverThread( BankAccount fromAccount, BankAccount toAccount,
                                       double anAmount )
   {
      source = fromAccount;
      destination = toAccount;
      amount = anAmount;
   }
   // this method is executed when the thread is started
   public void run()
   {
         for ( int i = 0;
            i <= REPETITIONS && ! isInterrupted(); i++ )
         {
            // move money from source to destination
            source.transfer( destination, amount );
          }
   }
   // instance variables
   private BankAccount source, destination;
   private double amount;
   // constants
   private static final int REPETITIONS = 500;
   private static final int DELAY = 5;
}
