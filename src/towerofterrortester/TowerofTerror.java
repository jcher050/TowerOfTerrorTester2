/********************************************************************************
* PantherID:  
* CLASS: COP 2210 – spring 2018
* ASSIGNMENT # Programming assignment 4
* DATE: April 9 2018
*
* PATHER ID OF ORIGINAL CODER:
*
* I hereby swear and affirm that this work is solely my own, and not the work 
* or the derivative of the work of someone else.
*******************************************************************************/



package towerofterrortester;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 * @author , This is the TowerofTerror class that contains the code for the program.
 */


//the class tower contains all of the functions to be used

/**
 * PID: , The Tower of Terror class contains all the functions that are going to be used.
 * 
 */
class TowerofTerror 
{    //this is the class with all of the different function
     //declaring an object that has an image in it 
     ImageIcon defaultPicture = new ImageIcon ("dead");
     //declaring a private strings to hold user's name 
     private String UserName;
     //declaring a string interaction to use in the if else statement option
     private String interaction;
     //declaring the frame component for the joption frame below 
     private Component frame; 
     //declaring string backpack to hold the user's items.
     String backpack = " ";
     
     
   
    
    //this is the greetig function it takes the users name and welcome them
     
     /**
      * PID: The greetingsFromTheGhost class will prompt the user to enter his/her name and welcome them.
      * @author
      */
    public void greetingsFromTheGhost()
    {
      //asking user for their name 
      //storing the name in string username
      UserName = JOptionPane.showInputDialog(null, 
              "Please enter your name in the box below.",
      "Greetings", JOptionPane.INFORMATION_MESSAGE);
      
        //declaring an object hpics that has an image in it 
        ImageIcon Hpics = new ImageIcon ("HauntedHspic");
      
       //greeting the user and printing the users name
      JOptionPane.showMessageDialog(null,"Welcome "
     + UserName + ", this is the Tower of Terror!! ", "Display Image", 
     JOptionPane.INFORMATION_MESSAGE, Hpics);
    }
          

    //this is the living room function
    /**
     * PID: , This the livingRoom method with all its items and functions.
     * 
     */
    public void livingRoom()
    {
        //declaring an object that has an image in it 
        ImageIcon Hpic3 = new ImageIcon ("livingroom");
        
        
      //print location and show image of the living room
      JOptionPane.showMessageDialog(null, "You are currently in the living room!"
      , "dialog", JOptionPane.INFORMATION_MESSAGE,Hpic3);
      
      //give users the option to intereact with a chest or walk to the bathroom
      // I learn of a better way to use Joption later on to do this
      // new way doesnt require conversion of object selectedoption to a string 
      // I use the new way throughout the rest of the code and it utilises int
      // it is a showoptiondialog instead of a show input dialog
      Object[] options = { "Chest", "Enter Elevator", 
          "Put the chest in your Backpack" };
      Object selectedOption = JOptionPane.showInputDialog(null, 
      "What would you like to do?",
      "Choose one",JOptionPane.INFORMATION_MESSAGE, null,
      options, options[0]);
      
      //converting the object selectedoption to a string interaction
      interaction = (String) selectedOption;
      
         //if else for the users choice to interact or go to the bext room
         if (interaction.equals("Chest"))
         {
             //calling the function chest
              chest();
         }
         else if(interaction.equals("Enter Elevator"))
         {
             //calling the function bathroom
             elevator();
         }
         else if(interaction.equals("Put the chest in your Backpack "))
         {
             //adding chest in user's backpack
             backpack += " Living Room Chest ";
             //showing the user that they have added an item to backpack
             JOptionPane.showMessageDialog(null, 
               "The living room Chest is now in your backpack", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
         }
      
    }
    
    //a function for the chest item
    /**
     * PID: , This function is for the chest and what happens when you open it.
     */
    public void chest()
    {
         //declaring an object that has an image in it 
            ImageIcon Hpic4 = new ImageIcon ("chestghost");
            JOptionPane.showMessageDialog(null, "You touched the Chest"
             + " and a ghost just flew out of it and scared you to death", 
          "dialog", JOptionPane.INFORMATION_MESSAGE, Hpic4);
          //calling the object hpic4 with the image 
          dead();
          //calling the dead function to eliminate the user and end the game
    }
    
    //a function for the bathroom
    /**
     * PID: , The bathroom method with its possible user affiliated options.
     */
    public void bathroom()
    {
            //declaring an object that has an image in it 
            ImageIcon Hpic6 = new ImageIcon ("bathroom");
            
             //print player's location on the screen with a picture
            JOptionPane.showMessageDialog(null, "You have entered the bathroom!",
                     " Dialog", JOptionPane.INFORMATION_MESSAGE, Hpic6);
            
            //this time around i used the easier joption method 
            //give user the option between two choices, mirror or curtain.
            //the choices are stored as object option
            //if none is chosen program will end
            //int answer2 is use to determine which option was chosen by user
          Object[] options2 = {"Look in the mirror", "Open the shower curtain",
              "Enter elevator"};
            int answer2 = JOptionPane.showOptionDialog(frame,
            "Would you like to approach the mirror or the shower?",
            "A Silly Question",//joption pane window title 
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options2,options2[1]);
            
          //if else statement do one or the other based on user choice
            if (answer2==0)
            {
                //calling mirror function inside of another function
                //function print mirror intereaction on the screen with picture
                mirror();

            }//else if statement to make sure that the condition are exact
            else if(answer2==1)
            {
                //calling shower function to get in the shower 
                //shower will steam up
                shower();
            }
            else if (answer2 == 2) 
            {
                //calling the elevator function
                elevator();
            }
    }
    
    //a function for the mirror in the bathroom downstairs
    /**
     * PID: , Method for the mirror and what happens when the user interacts with it.
     */
    public void mirror()
    {
        //declaring an object that has an image in it
         ImageIcon Hpic5 = new ImageIcon ("bloodyface");
         //print the consequence of the users action
              JOptionPane.showMessageDialog(null, "There is a bloody face "
                      + "looking back at you in the mirror",
                     " Dialog", JOptionPane.INFORMATION_MESSAGE,Hpic5);
    }
    
    // a function for the shower downstairs 
    /**
     * PID: , This is a method for the shower and its possible user options.
     */
    public void shower()
    {
         //declaring an object that has an image in it
        ImageIcon Hpic7 = new ImageIcon ("steamy");
        //print the consequenses of the user's action
         JOptionPane.showMessageDialog(null, "Room suddenly steams up "
                       + "and you feel fingers touching the back of your neck",
                     " Dialog", JOptionPane.INFORMATION_MESSAGE,Hpic7);
     
    }
    
    //a function for the dinning room
    /**
     * PID: , Dining room method for the dining room and its possible options for the user.
     */
    public void dinningRoom()
    {
         //declaring an object that has an image in it 
         ImageIcon Hpic8 = new ImageIcon ("dinningroom");
        // telling the user where they are currently located in the game
        JOptionPane.showMessageDialog(null, "You are in the dinning room!", 
                       "dialog", JOptionPane.INFORMATION_MESSAGE, Hpic8); 
        
        //print and show option on the screen for user to choose from
        Object[] options3 = {"Candelabra", "Enter elevator", 
            "Put Candelabra in the backpack"};//the choices
            int answer3 = JOptionPane.showOptionDialog(frame,//stored as int 
            "What would you like to do?",
            "A Silly Question",//window title
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options3,options3[1]);
         
        //do one or the other based on the users choices
        if (answer3==0)
        {
            //function that lights up the candle 
            candelabra();
  
        }
        else if(answer3==1)
        {
            //calling the elevator method
           elevator();            
        }
        else if(answer3==2)
        {
            //adding item to the user's backpack 
            backpack += " Candelabra ";
            //telling the user what was added to the backpack
            JOptionPane.showMessageDialog(null, 
               "The Candelabra is now in your backpack", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
        }
        
    }
    
    //candle lights up method 
    /**
     * PID: , A small method for the candelabra and what it does.
     */
      public void candelabra()
    {
        //print to screen
          JOptionPane.showMessageDialog(null, "The Candelabra lights up by "
                  + "themselves and see a death shadow ", 
                  "dialog", JOptionPane.INFORMATION_MESSAGE, defaultPicture);  
        
    }
    
      //kitchen function
      /**
       * This is the kitchen function that will include options for items to be gathered and such.
       */
    public void kitchen()
    {
        //print to screen with option
          Object[] options4 = {"Open Refrigerator", 
             "Touch Cabinet","Enter elevator", "Put refrigerator in backpack"};
            int answer4 = JOptionPane.showOptionDialog(frame,
            "You entered the kitchen, what would you like to do? Approach the"
            + " refrigarator or the Cabinet?",
            "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options4,options4[2]);
            
            //execute according to the choices made
            if (answer4==0)
            {
                //refrigerator function 
                refrigerator();
            }
            else if (answer4==1)
            {
                //cabinet function called
                cabinet();
            }
            else if (answer4==2)
            {
                //pantry function called 
                elevator();
            }
            else if(answer4==3)
            {   
                //adding item to user's backpack
                backpack += " Refrigerator ";
                //telling user's what was added to the backpack
                JOptionPane.showMessageDialog(null, 
               "The Refrigerator is now in your backpack", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
            }
    }
    
    //cabinet function
    /**
     * PID: , This is the cabinet method that includes the ghost.
     */
      public void cabinet()
    {
        //print to screen 
        JOptionPane.showMessageDialog(null, " The dishes and glasses "
                    + "start flying at you as soon as you open the door. "
                    + "You get hit in the head and feel yourself start "
                    + "moving towards a light", 
                 "dialog", JOptionPane.INFORMATION_MESSAGE, defaultPicture);
        
        //calling the dead function to eliminate the user and end the game
        dead();
    }
    
    // refrigerator function
      /**
       * PID: , Refrigerator method with a picture showing the user what's inside.
       */
    public void refrigerator()
    {
        //print to screen 
      JOptionPane.showMessageDialog(null,
                   " You Opened the refrigarator and find "
                     + "some delicious soul food ", 
                 "dialog", JOptionPane.INFORMATION_MESSAGE, defaultPicture);  
    }
    
    //pantry function
    /**
     * Here's the pantry containing options for the user to choose from.
     */
    public void pantry()
    {
       //let user know where they are 
      JOptionPane.showMessageDialog(null, "You are in the Pantry!", 
                       "dialog", JOptionPane.INFORMATION_MESSAGE); 
                
       //user is presented with options
       Object[] options5 = {"Open the dusty recipe box", 
       "Touch the broom", "Enter elevator", "put broom in backpack", 
       "put recipe box in backpack"};//option to choose from
                 int answer5 = JOptionPane.showOptionDialog(frame,
             "Would you like to approach the Broom or the dusty recipe box?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options5,options5[1]);
                //execute base on the choices made
                 if (answer5==0)
                 {
                     // recipe box function called
                     dustyRecipeBox();       
                 }
                 else if (answer5==1)
                 {
                     //broom function called
                     broom();
                 }  
                 else if (answer5 == 2) 
                 {   
                     //calling the elevator function
                     elevator();
                 }
                 else if(answer5==3)
                 {
                     //adding an item to user's backpack
                     backpack += " Broom ";
                     //Show user what was added to backpack
                   JOptionPane.showMessageDialog(null, 
                   "The Broom is now in your backpack", "Dialog", 
                   JOptionPane.INFORMATION_MESSAGE );
                   
                 }
                 else if (answer5==4)
                 {
                     //adding an item to user's backpack
                     backpack += " Dusty recipe box ";
                     //show user what was added to backpack
                     JOptionPane.showMessageDialog(null, 
                    "The Dusty recipe box is now in your backpack", "Dialog", 
                    JOptionPane.INFORMATION_MESSAGE );
                 }
    }
    
    //broom function
    /**
     *  This method here is for the broom and its message when interacted with.
     */
    public void broom()
    {
        //print scary action to screen
      JOptionPane.showMessageDialog(null, "Broom Flies up in "
                             + "the air as soon as you touch it ","Dialog",
                             JOptionPane.INFORMATION_MESSAGE,defaultPicture);  
    }
    
    //recipe function
    /**
     *  Here is the recipe box with what it contains.
     */
    public void dustyRecipeBox()
    {
        //print scary action to screen
      JOptionPane.showMessageDialog(null, " You open it up and a "
                           + "recipe for chocolate devils "
                           + "food cake appears out of no where ", "Dialog", 
                           JOptionPane.INFORMATION_MESSAGE,defaultPicture);
                     
    }
    
    // bedroom 1 function
    /**
     *  This is the bedroom method with its set of options for our user.
     */
    public void bedroom1()
    {
        // print location of player to the screen
         JOptionPane.showMessageDialog(null,
             "You are in the first Bedroom!", 
            "Dialog", JOptionPane.INFORMATION_MESSAGE);
         
         //print and give player two choice to chose from 
         Object[] options7 = {"Enter elevator", "Approach the chair", 
             "Go look out of the window", "Put the chair in your backpack"};
                 int answer7 = JOptionPane.showOptionDialog(frame,
             "Which bedroom would you like to go into?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options7,options7[2]);
         
                 // execute base on users choices 
          if (answer7==0)
                 {
                     //calling  elevaror function 
                     elevator();
                  
                 }
                 else if (answer7==1)
                 {
                     //calling roacking chair function
                     rockingChair();
                    
                 }
                 else if (answer7==2)
                 {
                     //calling window function
                   window();
                 }
                 else if (answer7==3)
                 {
                     //adding rocking chair to user's backpack 
                     backpack += " Rocking Chair ";
                     //showing user what was added to backpack
                     JOptionPane.showMessageDialog(null, 
                    "The Rocking Chair is now in your backpack", "Dialog", 
                    JOptionPane.INFORMATION_MESSAGE );
                 }
    }
    
    
    //rocking chair function
    /**
     * Rocking chair method showing what would happen if the user were to touch it.
     */
     public void rockingChair()
    {//print chair reaction to screen 
        JOptionPane.showMessageDialog(null, "The rocking chair falls apart!", 
                "Dialog", 
                JOptionPane.INFORMATION_MESSAGE, defaultPicture);
    }
     
     
    //window function
     /**
      *  Results for the window if interacted by the user.
      */
    public void window()
    {//print window activitied to screen for user
        JOptionPane.showMessageDialog(null, "The window fogs up and you hear"
                + "a strange noise outside the tower!", "Dialog", 
                JOptionPane.INFORMATION_MESSAGE, defaultPicture);
    }
    
    
    //bathroom function
    /**
     *  This method is for the second bathroom upstairs, its mostly the same as the other bathroom.
     */
    public void Bathroom2()
    { //telling user of current location
       JOptionPane.showMessageDialog(null, "You are in bathroom 2!", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
       //print option to screen
       Object[] options8 = {"Look in the mirror", 
                    "Approach the shower", "Enter elevator"};
                 int answer8 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options8,options8[2]);
         //if esle option statement 
          if (answer8==0)
                 {//calling mirror2 function
                   mirror2(); 
                 }
                 else if (answer8==1)
                 {//calling shower2 function
                    shower2(); 
                 }
                 else if (answer8==2)
                 {//calling the elevator function
                   elevator();
                 }
       
       
    }
    //mirror function
    /**
     *  This method is for the mirror upstairs.
     */
    public void mirror2()
    {//print mirror reaction to user
       JOptionPane.showMessageDialog(null, 
               "The mirror didnt show your reflection!", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE,defaultPicture ); 
    }
    
    
    //shower 2 function
    /**
     *  This method is for the shower upstairs.
     */
    public void shower2()
    {//print shower interaction to screen 
       JOptionPane.showMessageDialog(null, "The shower turns on by itself!",
               "Dialog", 
               JOptionPane.INFORMATION_MESSAGE, defaultPicture );
    }
    
    
    //bedroom2 function
    /**
    Method for the bedroom upstairs and its user affiliated options.
     */
    public void bedroom2()
    {//state user location in the game.
        JOptionPane.showMessageDialog(null, " You are in Bedroom 2!",
                             "Dialog", JOptionPane.INFORMATION_MESSAGE);
        //print user's option to screen
         Object[] options9 = {"Open the dresser", "Approach the Doll House", 
             "Enter elevator", "put Doll House in backpack"};
                 int answer9 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options9,options9[2]);
         //if else statement 
                if (answer9==0)
                 {//bedroom dresser function
                    bedroom2Dresser();
                 }
                 else if (answer9==1)
                 {//doll house function
                   dollHouse();  
                 }
                 else if (answer9==2)
                 {//elevator function
                  elevator(); 
                 }
                 else if (answer9==3)
                 {//adding dollhouse to backpack
                   backpack += " Doll House ";
                   //tell the user what was added to backpack
                     JOptionPane.showMessageDialog(null, 
                   "The Doll house is now in your backpack", "Dialog", 
                    JOptionPane.INFORMATION_MESSAGE );
                 }
   
    }
    
    
    //doll house function
    /**
      A method for the dollhouse and what it does when interacted.
     */
     public void dollHouse()
    {//print doll house  reaction to user's interaction
       JOptionPane.showMessageDialog(null, 
               " The dolls start dancing on their own ", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE,defaultPicture );
       
    }
     
     
    //bedroom2dresser function
     /**
      This method is for the bedroom dresser and what it does when opened.
      */
    public void bedroom2Dresser()
    {//print doll house  reaction to user's interaction
       JOptionPane.showMessageDialog(null, "A ghost flies out of the dresser "
           + "as soon as you open it and goes right though your body", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE, defaultPicture );
    }
    
    
    //master bedroom function
    /**
      A method that controls the master bedroom. 
     */
     public void masterBedroom()
    {// tell the user where they are currently located in the tower
        JOptionPane.showMessageDialog(null, "You are in the Master Bedroom ", 
                             "Dialog",JOptionPane.INFORMATION_MESSAGE);
        //print the user'd options
                  Object[] options10 = {"Open the jewelry box"
                 , "Enter elevator", "Put the jewelry box in your backpack"};
                 int answer10 = JOptionPane.showOptionDialog(frame,
                  "Which action do you want to do?",
                 "A Silly Question",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.QUESTION_MESSAGE,null,options10,options10[1]);
         //if else statement 
                   if (answer10==0)
                    {//calling the jewelry box function
                      jewelryBox();
                    }
                   else if (answer10==1)
                    {  //calling the elevator function
                      elevator();
                    }
                   else if (answer10==2)
                    {//adding item to user's backpack
                       backpack += " Jewelry Box ";
                       //tell the user what was added to the backpack
                       JOptionPane.showMessageDialog(null, 
                     "The jewelry box is now in your backpack", "Dialog", 
                     JOptionPane.INFORMATION_MESSAGE );
                    }
    } 
     
     
 //jewelry box function
     /**
       Jewelry box method that contains the doom inside.
      */
    public void jewelryBox()
    {//jewelry box activity
       JOptionPane.showMessageDialog(null, 
         "You find the cursed Hope Diamond and feel your doom ", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE,defaultPicture );
       //calling the dead function 
       dead();
    }
    
    
    //master bathroom function
    /**
     *  This method controls the master bathroom.
     */
    public void masterBathroom()
    {//tell user of their current location
       JOptionPane.showMessageDialog(null, 
               "You are in the Master bathroom", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
       //print option of next action to the screen
        Object[] options10 = {"Rub the lamp", "Approach the shower", 
            "Enter elevator", "Put lamp in your backpack"};
                 int answer10 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options10,options10[1]);
         //if else statement 
                if (answer10==0)
                 {//calling lamp function
                    lamp();
                 }
                 else if (answer10==1)
                 {//calling master shower function
                    masterShower();
                 }
                 else if (answer10 == 2)
                 {//calling elevator function
                     elevator();
                 }
                 else if (answer10==3)
                 {
                     //adding item to backpack
                     backpack += " Lamp ";
                     //let user know what was added to backpack
                     JOptionPane.showMessageDialog(null, 
                   "The lamp is now in your backpack", "Dialog", 
                   JOptionPane.INFORMATION_MESSAGE );
                 }
    }  
    // lamp function
    /**
     *  Lamp method with its message.
     */
       public void lamp()
    {//print lamp interaction 
       JOptionPane.showMessageDialog(null, 
               "A genie pops out who says he’ll grant you 3 wishes ", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE,defaultPicture );
       
    }
    //master shower function
       /**
        *  Shower method with its message.
        */
    public void masterShower()
    {// print master shower activities 
       JOptionPane.showMessageDialog(null, 
         "Suddenly hear singing in the shower, but no one is there", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE, defaultPicture );
    }
    //basement function
    /**
     *  This method is for the basement.
     */
    public void basement()
    {
        //print user's current location
        JOptionPane.showMessageDialog(null, 
               "You are in the basement now", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
       //options given to user
        Object[] options100 = {"Go to the Boiler Room "
                 , "Go to the storage Room", "Enter Elevator"};
                 int answer100 = JOptionPane.showOptionDialog(frame,
             "Where do you want to go?",
             "A Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options100,options100[1]);
         //if else statement to select one option
                if (answer100==0)
                 {//calling boiler room function
                    boilerRoom();
                 }
                 else if (answer100==1)
                 {//callinf storage room function
                    storageRoom();
                 }
                 else if (answer100 == 2)
                 {//calling elevator function
                     elevator();
                 }
    }
    //boiler room function
    /**
     * This method for the boiler room with its one message.
     */
    public void boilerRoom()
    {
        //tell user that the boiler room is empty
        JOptionPane.showMessageDialog(null, 
         "It is empty, nothing to see here", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
    }
    //storage room function
    /**
     *  This is the storage room with its user options for the chest or elevator.
     */
    public void storageRoom()
    {//tell user of their current location 
        JOptionPane.showMessageDialog(null, 
               "You are in the storage room, there is a chest in the corner"
                , "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
       //show user their interaction options
        Object[] options110 = {"Open the chest"
                 , "Go back to the elevator"};
                 int answer110 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "A Silly Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options110,options110[1]);
         //if else statement for chest or elevator use
                if (answer110==0)
                 {//calling storage room chest function
                    storageRoomChest();
                 }
                 else if (answer110==1)
                 {//calling elevator function
                    elevator();
                 }
    }
    //calling storage room chest
    /**, This method is here for the chest in the storage room.
     */
    public void storageRoomChest()
    {//show user the options
        Object[] options110 = {"Put the key in you backpack"
                 , "Leave the key in the chest"};
                 int answer110 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "A Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options110,options110[1]);
         //if else statement between the choice of taking or leaving the key
                if (answer110==0)
                 {//adding the attic key to backpack
                     backpack += " Attic_key ";
                     //tell user they added the key to backpack
                     JOptionPane.showMessageDialog(null, 
                  "The Key to the Attic is now in your backpack", "Dialog", 
                 JOptionPane.INFORMATION_MESSAGE );
                 }
                 else if (answer110==1)
                 {//tell user they didnt take the key 
                   JOptionPane.showMessageDialog(null, 
                  "You did not take the key", "Dialog", 
                  JOptionPane.INFORMATION_MESSAGE );
                 }
    }
    //elevator function
    /**
     *  The most important method which controls the elevator in our TowerofTerror game.
     */
    public void elevator()
    {
//once inside the tower user will be face with the floor options in the elevator 
      
Object[] options = { "Floor 0", "1st Floor", "2nd Floor", "3rd Floor", 
                   "4th Floor", "5th Floor", "6th Floor", "7th Floor",
      "8th Floor", "9th Floor", "10th Floor", "11th Floor", "12th Floor" };
            Object selectedOption = JOptionPane.showInputDialog(null, 
            "Please select which floor to go next in the Tower of Terror! ",
            "selection",JOptionPane.INFORMATION_MESSAGE, null,
             options, options[0]);
 

           //declaring string entering1 to use in the if else statement
           //converting selectedOption to a string
           //I realized later on that there was an easier way to do this 
           //without having to convert the object to a string 
           //but lesson learn I understand JoptionPane a bit more now
        
          String entering1 = (String) selectedOption;
          //convert object selected option to a string entering1
          while(!entering1.equals("Exit")) 
          { //while loop if entering 1 does not equal exit loop keeps going.
           //nested if else statement use to go per user selection in the elevator 
                    if (entering1.equals("Floor 0"))
                     {
                       //calling on the basement room method
                       basement();
                     }
                    else if (entering1.equals("1st Floor"))
                     {  //calling first floor function
                         FirstFloor();
                     }
                    else if (entering1.equals("2nd Floor"))
                     { //calling kitchen function
                       kitchen();
                      }
                    else if (entering1.equals("3rd Floor"))
                     { //calling pantry function
                     pantry();
                      }
                    else if (entering1.equals("4th Floor"))
                     { //calling bathroom function
                     bathroom();
                      }
                    else if (entering1.equals("5th Floor"))
                     { //calling bathroom2 function
                     Bathroom2();
                      }
                    else if (entering1.equals("6th Floor"))
                     { //calling master bedroom function
                    masterBathroom();
                      }
                    else if (entering1.equals("7th Floor"))
                     { //calling dinning room function
                     dinningRoom();
                     }
                    else if (entering1.equals("8th Floor"))
                     { //calling master bedroom function
                     masterBedroom();
                      }
                    else if (entering1.equals("9th Floor")) 
                    {//calling living room function
                     livingRoom();
                    }
                    else if (entering1.equals("10th Floor"))
                     { //calling bedroom1 function
                     bedroom1();
                      }
                    else if (entering1.equals("11th Floor"))
                     { //calling bedroom2 function
                     bedroom2();
                     }
                    else if (entering1.equals("12th Floor"))
                    {//nested if else statement denying or giving access to the attic 
                        if (backpack.contains(" Attic_key "))//checking for the attic key
                          {attic();}//calling the attic function
                        else //do not have the key 
                          {//print user do not have the key
                              JOptionPane.showMessageDialog(frame, 
                            "You do not have the key for the Attic", "Dialog",
                            JOptionPane.INFORMATION_MESSAGE);
                              elevator();}
                    }
          }
          
          
    }
     //attic function
    /**
      This is the method for the attic and key options.
     */
     public void attic()
    {//where the user is located in the game
        JOptionPane.showMessageDialog(null, 
         "You are now in the attic", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE);
        //present the option for using the elevator or opening the chest 
        Object[] options112 = {"use the elevator *", 
                      "open the chest"};
                 int answer112 = JOptionPane.showOptionDialog(frame,
             "Which action do you want to do?",
             "Question",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options112,options112[1]);
         
                //if else statement for using the elevator or opening the chest 
                if (answer112==0)
                 {//calling elevator function
                   elevator();
                 }
                 else if (answer112==1)
                 {//show user option to either take or leave the key
                   Object[] options122 = 
                   {"Take the exit key and put it in your backpack", 
                               "Leave the exit key in the chest"};
                         int answer122 = JOptionPane.showOptionDialog(frame,
                             "Which action do you want to do?",
                                     "Question",
                                  JOptionPane.YES_NO_CANCEL_OPTION,
                   JOptionPane.QUESTION_MESSAGE,null,options122,options122[1]);
                      //nested if else statement for taking or leaving the key
                           if (answer122==0)
                              {//add key to user backpack
                                  backpack += " Exitkey ";
                                  //print what user put in backpack
                                JOptionPane.showMessageDialog(null, 
                              "You have the front door key "
                                      + "in your backpack now", "Dialog", 
                                 JOptionPane.INFORMATION_MESSAGE);
                               }
                           else if (answer122==1)
                              {
                                //print user did not take the key
                                JOptionPane.showMessageDialog(null, 
                              "No key for you", "Dialog", 
                                 JOptionPane.INFORMATION_MESSAGE);
                               }
                 }
     
    }
     
    // front door method.
     /**
      * This is the first floor with its user options.
      */
    public void FirstFloor() 
    { 
        
        Object[] options2 = {"use the elevator", 
                      "Exit out of the front door", "Check your backpack"};
            int answer1 = JOptionPane.showOptionDialog(null,
            "What would you like to do next?",
            "A Question",//joption pane window title 
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,null,options2,options2[1]);
    do { //do while loop for the first floor
        //if else statement going base of what the user choose to do
            if (answer1 == 1) 
            {//nested if else statement checking for the key to exit the tower
               if (backpack.contains(" Exitkey "))//using the contain method to check for key
                  {//tell the user that they have exited the building after checking for the key
                    JOptionPane.showMessageDialog(null, "You have "
                        + "exit the the building!");
                    System.exit(0); // System exits
                    
                  }
               else
                  {//tell the user they do not have the key to exit the building 
                     JOptionPane.showMessageDialog(null, 
                             "You do not have the front door key to exit");
                  elevator(); //calling the elevator function
                  }
            }
            else if (answer1 == 0) 
            {//callinf the elevator function
                elevator(); 
            }
            else if (answer1==2)
            {//warning user that backpack might be empty 
                JOptionPane.showMessageDialog(null, 
               "The next screen could be empty if you did not put "
                       + "anything in your backpack", "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
               //printing what is in the user's backpack 
                JOptionPane.showMessageDialog(null, 
               " " + backpack, "Dialog", 
               JOptionPane.INFORMATION_MESSAGE );
                break;//stop the loop
            }
        }while(answer1 != 0);
    }
    
    
    //dead function 
    //created to simulate the dead of a user in the game base off of what items they    intereact with
    /**
     *  Used to simulate the death of the user based on what they interacted with.
     */
    public void dead ()
    {//show user that they died based off of their action
        JOptionPane.showMessageDialog(null, "You are now dead!"
                + " Hope you go to heaven");
        System.exit(0); //end and exit the program
    }
}