public class Master 
{
   public static void main( String[ ] args ) 
   {
      // create first thread 
      Slave thread1 = new Slave ( "Thread 1", 5 );
      // create second thread
      Slave thread2 = new Slave ( "Thread 2", 2 );
      // create third thread
      Slave thread3 = new Slave ( "Thread 3", 7 );

      // start first thread
      thread1.start();
      // start second thread
      thread2.start();
      // start third thread
      thread3.start();

      // In principle, we may be interrupted while waiting for 
      // in a join, so we need a try-catch block.
      // Actually, we know nothing can interrupt main thread.
      // so we just use an empty catch block.
      try
      {
        // wait for each of the other threads to finish  
        thread1.join();
        thread2.join();
        thread3.join();
      }
      catch (InterruptedException e)
      {
      }
      // do something that needs all other threads 
      // to have finished
      System.out.println( "All work finished" );
   }
   // main thread exits
}
