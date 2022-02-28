
public class BankAccountThreadTest
{
   public static void main( String[] args )
   {
      // create a new bank account
      BankAccount account = new BankAccount();
      // create a deposit thread
      DepositThread deposit =
                new DepositThread( account, 100 );
      // create a withdraw thread
      WithdrawThread withdraw =
                new WithdrawThread( account, 100 );
      // start deposit thread
      deposit.start();
      // start withdraw thread
      withdraw.start();
   }
}
