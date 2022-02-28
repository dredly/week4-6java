public class GreetingTest
{
   // main method
   public static void main( String[] args )
   {
      // create first greeting object
      Greeting g1 = 
                new Greeting( "Hello World!" );
      // create second greeting object
      Greeting g2 = 
                new Greeting( "Goodbye World!" );
      // create first thread using first greeting
      // object as target
      Thread thread1 = new Thread( g1 );
      // create second thread using second greeting
      // object as target
      Thread thread2 = new Thread( g2 );
      // start first thread
      thread1.start();
      // start second thread
      thread2.start();
   }
   // main thread exits
}
