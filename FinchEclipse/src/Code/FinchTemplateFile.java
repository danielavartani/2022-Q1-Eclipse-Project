package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      //Part 1
     
      myFinch.playTone(1318, 300); // hz, ms
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1174, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(880, 500);
      
      myFinch.playTone(523, 300);
      myFinch.playTone(659, 300);
      myFinch.playTone(880, 300);
      myFinch.playTone(987, 300);
      
      myFinch.playTone(659, 300);
      myFinch.playTone(830, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1046, 300);
      
      myFinch.playTone(659, 300);
      
      myFinch.playTone(1318, 300); // hz, ms
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1174, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(880, 500);
      
      myFinch.playTone(523, 300);
      myFinch.playTone(659, 300);
      myFinch.playTone(880, 300);
      myFinch.playTone(987, 300);
      
      myFinch.playTone(587, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(880, 500);
    
     //Repeat Part 1 with different ending
      myFinch.playTone(1318, 300); // hz, ms
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1174, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(880, 500);
      
      myFinch.playTone(523, 300);
      myFinch.playTone(659, 300);
      myFinch.playTone(880, 300);
      myFinch.playTone(987, 300);
      
      myFinch.playTone(659, 300);
      myFinch.playTone(830, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1046, 300);
      
      myFinch.playTone(659, 300);
      
      myFinch.playTone(1318, 300); // hz, ms
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(1244, 300);
      myFinch.playTone(1318, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(1174, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(880, 500);
      
      myFinch.playTone(523, 300);
      myFinch.playTone(659, 300);
      myFinch.playTone(880, 300);
      myFinch.playTone(987, 300);
      
      myFinch.playTone(587, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(987, 300);
      myFinch.playTone(880, 500);
      myFinch.sleep(100); //rest for 100ms
      myFinch.playTone(987, 300);
      myFinch.playTone(1046, 300);
      myFinch.playTone(1174, 300);
      
     
      
      // Write some code here!
      System.out.println("W");

      System.out.println("X");

      System.out.print("Y");

      System.out.print("Z");
      
      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

