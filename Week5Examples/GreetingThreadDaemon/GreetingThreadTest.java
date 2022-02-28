public class GreetingThreadTest
{
   public static void main( String[] args )
   {
      // create first thread
      GreetingThread thread1 = 
                  new GreetingThread( "Hello World!" );
      // create second thread
      GreetingThread thread2 = 
                  new GreetingThread( "Goodbye World!" );
      // make first thread a daemon thread
      thread1.setDaemon( true );
      // make second thread a daemon thread
      thread2.setDaemon( true );
      // start first thread
      thread1.start();
      // start second thread
      thread2.start();
      try
      {
         // user thread main sleeps for 5 seconds
         System.out.println( "Main thread sleeps" );
         Thread.sleep( 5000 );
      }
      catch ( InterruptedException ie )
      {
         System.err.println( ie.toString() );
      }
      System.out.println( "Main thread wakes up" );
   }
   // the main thread exits and, as it is the only user
   // thread, the daemon threads stop immediately and the
   // application halts
}
