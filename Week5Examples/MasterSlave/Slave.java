public class Slave extends Thread
{
   // Slave constructor
   public Slave( String name, int numberOfTimes )
   {
      super( name );
      repeats = numberOfTimes;
   }

   public void run()
   {
      try
      {
         for ( int i = 1; i <= repeats; i++ )
         {
            // output thread name and thread group
            System.out.println( getName() + "." + i);
            // sleep for 1 second
            Thread.sleep( DELAY );
         }
      }
      // exception generated if sleeping thread is
      // interrupted
      catch ( InterruptedException ie )
      {
         System.out.println( 
                          "Interrupted while sleeping" );
      }
   }
   // instance variables
   private int repeats;
   // constants
   private static final int DELAY = 1000;
}
