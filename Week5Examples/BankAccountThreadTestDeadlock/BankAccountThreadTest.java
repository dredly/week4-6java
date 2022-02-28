public class BankAccountThreadTest
{
   public static void main( String[] args )
   {
      // create two new bank accounts
      BankAccount myAccount = new BankAccount(1000);
      BankAccount yourAccount = new BankAccount(1000);
 
      // create and start thread moving money from me to you
      System.out.println("Starting first mover thread");
      MoverThread meToYou =
                new MoverThread( myAccount, yourAccount, 75 );
      meToYou.start();

      // wait a short time, then start second thread         
      try
      {
        Thread.sleep(2);
      }
      catch ( InterruptedException ie )
      {
         System.out.println( 
                        "Interrupted while sleeping" );
      }

      // create and start thread moving money from you to me
      System.out.println("Starting second mover thread");
      MoverThread youToMe =
                new MoverThread( yourAccount, myAccount, 99 );
      youToMe.start();
   }
}
