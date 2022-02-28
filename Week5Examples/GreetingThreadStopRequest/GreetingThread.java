import java.util.Date;
public class GreetingThread extends Thread
{
   // GreetingThread constructor
   public GreetingThread( String aGreeting )
   {
      greeting = aGreeting;
   }
   // this method is executed when the thread is started
   public void run()
   {
      stopRequested = false;
      try
      {
         for ( int i = 0; 
             i <= REPETITIONS && ! stopRequested; i++ )
         {
            // get current date and time
            Date now = new Date();
            // output date and time and greeting
            System.out.println( now + " " + greeting );
            // sleep for 1 second
            Thread.sleep( DELAY );
         }
      }
      // exception if sleeping thread is interrupted
      catch ( InterruptedException ie )
      {
        System.out.println("Interrupted in sleep");
      }
      // clean up procedure
   }
   public void requestStop() 
   { 
     stopRequested = true;
     interrupt(); 
   }
   // instance variable
   private String greeting;
   private Boolean stopRequested;
   // constants
   private static final int REPETITIONS = 10;
   private static final int DELAY = 1500;
}
