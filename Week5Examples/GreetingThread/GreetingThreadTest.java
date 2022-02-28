public class GreetingThreadTest
{
   // main method
   public static void main( String[] args )
   {
      // create first thread
      GreetingThread thread1 = 
                  new GreetingThread( "Hello World!" );
      // create second thread
      GreetingThread thread2 = 
                  new GreetingThread( "Goodbye World!" );
      // start first thread
      thread1.start();
      // start second thread
      thread2.start();
   }
   // main thread exits
}
