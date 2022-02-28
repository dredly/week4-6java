import java.util.Date;
public class Greeting implements Runnable
{
   // Greeting constructor
   public Greeting( String aGreeting )
   {
      greeting = aGreeting;
   }
   // this method is executed when the Thread is started
   public void run()
   {
      try
      {
         for ( int i = 0; i <= REPETITIONS; i++ )
         {
            // get current date and time
            Date now = new Date();
            // output date and time and greeting
            System.out.println( now + " " + greeting );
            // sleep for 1 second
            Thread.sleep( DELAY );
         }
      }
      // exception generated if sleeping thread is
      // interrupted
      catch ( InterruptedException ie )
      {
         System.err.println( ie.toString() );
      }
   }
   // instance variable
   private String greeting;
   // constants
   private static final int REPETITIONS = 10;
   private static final int DELAY = 1000;
}
