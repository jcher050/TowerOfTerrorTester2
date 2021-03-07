package towerofterrortester;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/******************************************************************************
* PantherID:

* CLASS: COP 2210 – spring 2018
* ASSIGNMENT # Programming assignment 4
* DATE: April 9 2018
*
* PATHERID OF ORIGINAL CODER:
*
* I hereby swear and affirm that this work is solely my own, and not the work 
* or the derivative of the work of someone else.
*******************************************************************************/

/*
* The terror of tower program implements an application that is a hunted tower
* that the user will play via word and image. the user will have to navigate 
* carefully throughout the tower to avoid  death. the user's need a key to 
* access the attic and to exit the building also.
*


package towerofterrortester;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * 
 * This is the tester class that will execute everything from TowerofTerror.java
 */
public class TowerOfTerrorTester 
{

   
    
    /**
     * 
     * This is the main method that will create an object for the TowerofTerror and kickstart the program.
     */
    public static void main(String[] args) 
    {
        /*@param newhouse
        //declaring and creating new object*/
        TowerofTerror newhouse = new TowerofTerror ();
        
        //greeting the user
        newhouse.greetingsFromTheGhost();
        
        //declaring an object that has an image in it 
        ImageIcon Hpic2 = new ImageIcon ("Frontdoor");
        
        String [] option = {"Enter", "No thanks!"};
        
        // setting the joption pane equal to an integer 
        //so that I can use that integer answer in the if statement below
        // and also asking user to choose between entering the front door or not
        //if the user chooses no the program ends.
        int answer = JOptionPane.showOptionDialog(null,
         "Would you like to go through the front door  to enter the tower? ", 
         "choose one", 
         JOptionPane.INFORMATION_MESSAGE, 
         JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
        
        //if and else statement to go base on the user choice
         // 0 for yes and 1 for no from the user's choice 
         if (answer==0)
         { 
              //User have chosen to enter the house 
            JOptionPane.showMessageDialog(null, 
            "Yes! You are now in the first floor, "
                    + "appproaching the elevator to select a floor", 
            "Display Image", 
            JOptionPane.INFORMATION_MESSAGE);
           
             
             newhouse.elevator();
            
         }
         else if(answer==1)
         {
             // User chose not to enter the house
             JOptionPane.showMessageDialog(null, 
             "Oh well! Better safe than sorry!", " Dialog", 
             JOptionPane.INFORMATION_MESSAGE);
         }
        
    }
}
