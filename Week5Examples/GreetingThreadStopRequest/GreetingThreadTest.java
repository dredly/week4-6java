public class GreetingThreadTest
{
   public static void main( String[] args )
   {
      // create first greeting thread
      GreetingThread thread1 = 
                  new GreetingThread( "Hello World!" );
      // create second greeting thread
      GreetingThread thread2 = 
                  new GreetingThread( "Goodbye World!" );
      // start first thread
      thread1.start();
      // start second thread
      thread2.start();
      try
      {
         // main thread sleeps for 5 seconds
         System.out.println( "Main thread sleeps" );
         Thread.sleep( 5000 );
      }
      catch ( InterruptedException ie )
      {
         System.err.println( ie.toString() );
      }
      System.out.println( "Main threads wakes up" );
      // requestStop is sent to first thread
      thread1.interrupt();
   }
   // main thread exits
}
