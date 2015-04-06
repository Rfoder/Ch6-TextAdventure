
/**
 * This is the class to The NeverEnding Story
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Robert Foder // Really cool person!!!
 * @version 3/23/15
 */

public class Game // parent class

{

    private Parser parser; // grabs from parser class
    private Room currentRoom; //grabs from Room class
    
   

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
       
    }
    

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    { // Rooms of the Game
        Room forestsedge, sign, backtovillage, forest, foresthouse, forestdepths, forestcave1, forestcave2, forestFinal, cave, cave1, 
        cave2, cave3, caveFinal, water, bone, boneFight, ax, advance, scrolls, goblinAttack, scrollsSave, side1, side2,
        house, houseEnd, depths, depthsEnd, caveEnterence, caveEnterence1, caveEnterence2, caveEnterencedepths, flint, hole, down,
        goblin, goblin1, basement,basementEnd, door, flint1, depths1, depths2End, stick, stickEnd;
      
        // intro to the game
        forestsedge = new Room("outside a forest you see a sign");
        sign = new Room("reading the sign, it reads: BEWARE!! entering the dark forest.\n"+
        "Do you want to enter the dark forest?");
        backtovillage = new Room("not able to go back the storm is to heavy");
        forest = new Room (" in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                        "there is a cave to your west,\n"+
                        "a old rickety house to you north\n" +
                        "The depths of the forest to your south");
                       
         //the cave rooms
        cave = new Room("outside the cave enterence, there is a faint\n"+
        "voice comeing from within the cave.");
        cave1 = new Room("outside the cave enterence, there is a faint\n"+
        "voice comeing from within it.");
        cave2 = new Room("outside the cave enterence, there is a faint\n"+
        "voice comeing from within it.");
        caveFinal = new Room("outside the cave enterence, there is a faint\n"+
        "voice comeing from within it.");
        caveEnterence = new Room(" entering the cave, it is to dark\n"+
        "to see you will need a flint and, a stick to make a tourch to light your way!");
        caveEnterence1 = new Room(" entering the cave, it is to dark\n"+
        "you have a flint and, stick light your way!!!");
        caveEnterence2 = new Room(" entering the cave, it is to dark\n"+
        "you have atleast one of your objects to light your way!!!");
        caveEnterencedepths = new Room(" entering the cave, it is to dark\n"+
        "you have atleast one of your objects to light your way!!!");
        forestcave1 = new Room (" in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                        "the depths of the forest to your south");
       forestcave2 = new Room (" in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                       "a old rickety house to you north\n");
       forestFinal = new Room (" in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                       "there is the cave to your west,\n");             
        flint = new Room("lghting the tourch, the room is illuminated\n"+
        ",but by making a sound when you lit the tourch the path behind you caved in.\n"+
        "\nThere is a long and narrow corridor leading down, and there is a\n"+
        "tiny hole to your left, do you look through it?");
        hole = new Room (" peering through the hole, you see a large goblin army.\n"+
        "You also see the villages scrolls.");
        down = new Room ("headed down the corridor, you reach a large room.\n"+
        "That faint noise has become a roaring yell of many voices.\n"+
        "What do you do?");
        goblin = new Room("sneaking into the room, a massive goblin army and,\n "+
        "your villages scrolls are in it, you try to grab the scrolls but fail.\n"+
        "The goblins corner you, near by is a splintered bone, and a bucket of water.");
        water = new Room("grabing the bucket of water and, splashing the goblins\n"+
        "with it. clearly it did nothing and they killed you! :(\n\n"+
        "please try again!!");
        bone = new Room("grabbing the sharp bone and impaling the closest goblin\n"+
        "with it, you watch as its green blood gushes out. The others advance one you\n"+
        "what do you do?");
        boneFight = new Room("grabbing the sharp bone again, you grasp onto it with two\n"+
        "hands, pointing it at the goblins they are nervous but, not scared. You see a couple\n"+
        "feet away from you a broad ax, you manage to reach it." );
        ax = new Room("holding the broad ax, the goblins step back but, do not leave\n"+
        "what do you do?");
         advance = new Room("advacing on the goblins they are stepping back but, only go so\n"+
         "far. They relize you are out numbered.");
        scrolls = new Room("remembering the scrolls they are nearby you. you try to head\n"+
        "towards the scrolls. A few of the goblins jump in your path.");
         scrollsSave = new Room("cutting them down the other goblins see your might\n"+
         "and, run away. you retreave you village's scrolls and head back towards\n"+
         "your village. You are a hero!!!\n\n"+
         "Thank you for playing the NeverEnding Story!!!!\n"+
         "type restart to play again or quit to quit!");
         goblinAttack = new Room ("taking steps back, they are overwhelming, they are\n"+
         "going to kill you, however you are close to their roasting fire pit.\n"+
         "you run behind it, the goblins scatter, both sides, you are corrneds again\n"+
         "your only option is to attack one of the sides and hope for the best"); 
          side1 = new Room ("you attack the larger side, you die :(\n"+
          "type restart to restart!");
          side2 = new Room ("you attack the smaller side, you kill enough goblins\n"+
          "to make the other side flea!! the day is yours. you retreave you village's\n"+
          "scrolls and head back towards your village. You are a hero!!!\n\n"+
         "Thank you for playing the NeverEnding Story!!!!\n"+
         "type restart to play again or quit to quit!");
         goblin1 = new Room ("walking into the room, this was not a smart desison!\n"+
        "There is a goblin hord and they spot you, and kill you  :( \n\n"+
        "Try again!");
        
        //the house rooms
        house = new Room("outside a rickety old house, all of its doors\n"+
        "are hammered shut. but around its side,\n"+ 
       "the basement apears to be open");  
       houseEnd = new Room("outside a rickety old house, all of its doors\n"+
        "are hammered shut. but around its side,\n"+ 
       "the basement apears to be open");  
       basement = new Room ("inside the house's basement you notic flint\n"+
       "on the ground. Pick it up?");
        basementEnd = new Room ("inside the house's basement you notic flint\n"+
       "on the ground. Pick it up?");
       door = new Room ("trying the main enterence it isent working!");
       foresthouse = new Room (" in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                        "there is a cave to your west,\n"+
                        "The depths of the forest to your south");
       
       
       //the depths rooms
       depths = new Room("inside the true depths of the forest not even\n"+
       "the bravest of the brave have entered. Do you dare?");
       depths1 = new Room ("not able the enter the depths, the woods are\n"+
       "to thick to enter, however there is a nice piece of walking stick\n"+
       "you could use!");
       depthsEnd = new Room("inside the true depths of the forest not even\n"+
       "the bravest of the brave have entered. Do you dare?");
       depths2End = new Room ("not able the enter the depths, the woods are\n"+
       "to thick to enter, however there is a nice piece of walking stick\n"+
       "you could use!");
       stick = new Room ("grabing the stick and leaving the depths");
       stickEnd = new Room ("grabing the stick and leaving the depths");
      forestdepths = new Room ("in the forest, it is a dark and a mysterious place, dangers lerk,\n" +
                        "there is a cave to your west,\n"+
                        "a old rickety house to you north\n");
                    
                
        
        
        //intro room links
        forestsedge.setExit("sign", sign);
        forestsedge.setExit("village" ,backtovillage);
        backtovillage.setExit("sign",forestsedge);
        backtovillage.setExit("village",forestsedge);   
        sign.setExit("forest", forest);
        forest.setExit("west", cave);
        forest.setExit("north", house);
        forest.setExit("south", depths);
        
        //cave room links
        cave.setExit("cave", caveEnterence);
        cave.setExit("back", forest);
        cave.setExit("cave", caveEnterence);
        caveEnterence.setExit("back", forest);
        
        
        //cave2nd time around links
        
        
        cave1.setExit("west",caveEnterence1);
        caveEnterence1.setExit("cave",flint);
        flint.setExit("left", hole);
        flint.setExit("down", down);
        hole.setExit("down", down); 
        down.setExit("walk", goblin1); 
        down.setExit("sneak", goblin); 
        goblin.setExit("water", water); 
        water.setExit("restart",forestsedge ); 
        goblin.setExit("bone", bone); 
        bone.setExit("move", boneFight); 
        boneFight.setExit("ax", ax); 
        ax.setExit("advance", advance); 
        advance.setExit("step", goblinAttack); 
        goblinAttack.setExit("one", side1);
        goblinAttack.setExit("two", side2);
        side1.setExit("restart",forestsedge );
        side2.setExit("restart",forestsedge );
        ax.setExit("goblins", scrolls); 
        scrolls.setExit("scrolls", scrollsSave); 
        scrollsSave.setExit("restart", forestsedge); 
        goblin1.setExit("restart", forestsedge);    // end of game!!!
        
      
        
        //house links
        house.setExit("basement", basement);
        house.setExit("door", door);
        door.setExit("basement", basement);
        basement.setExit("back", house);
        basement.setExit("flint", foresthouse);
        foresthouse.setExit("south", depths);
        foresthouse.setExit("west", cave2);
        cave2.setExit("cave", caveEnterence2);
        cave2.setExit("back", caveEnterence2);
        caveEnterence2.setExit("back", forestcave2);
        forestcave2.setExit("north", houseEnd);
        
        houseEnd.setExit("door",door );
        houseEnd.setExit("basement", basementEnd);
        door.setExit("basement", basementEnd);
        basementEnd.setExit("back", houseEnd);
        basementEnd.setExit("flint", forestFinal);
        forestFinal.setExit("west", caveFinal);
        caveFinal.setExit("explore",caveEnterence1);
        //house1
       
        
        
        //the depths links
        depths.setExit("further", depths1);
        depths.setExit("back", forest);
        depths1.setExit("stick", stick);
        stick.setExit("back", forestdepths);
        forestdepths.setExit("north", house);
        forestdepths.setExit("west", cave2);
        cave2.setExit("cave", caveEnterence2);
        cave2.setExit("back", caveEnterence2);
        caveEnterence2.setExit("back", forestcave2);
        forestcave2.setExit("south", depthsEnd);
        
        depthsEnd.setExit("further", depths2End);
        depthsEnd.setExit("back", forestcave1);
         depths2End.setExit("stick", stickEnd);
        stickEnd.setExit("back", forestFinal);
        forestFinal.setExit("west", caveFinal);
        caveFinal.setExit("explore",caveEnterence1);
        
        currentRoom = forestsedge;  // the very start of the game.
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye\n"+
        "Come back soon!!!!\n"+
        "Rate this game well!!!");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() // the introduction statement describing whats going on
    {
        System.out.println();
        System.out.println("Welcome to the NeverEnding Story!");
        System.out.println("The World of The NeverEnding Story is a new, incredible adventurous game.");
        System.out.println();
        System.out.println("You are an adventurer chosen by the elders of your village to retrieve the"); 
        System.out.println("ancient scrolls of your villages history. You alone must enter deep into the ");
        System.out.println("forbiden forests to retrive them. You mount your horse and ride to the edge  ");
        System.out.println("of the forest it starts to rain as you arive. You stand at the edge frightend, theres a sign");
        System.out.println("You stand at the edge frightend, theres a sign");
        System.out.println("posted in the ground.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println("Your have various command words to use!");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }
    
    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
  
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;
          // commands to enter each action
        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {                       // case are used so user can go from room to room.
            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;

            case HELP:
                printHelp();
                break;
                
            case LOOK:
                look();
                break;  

            case GO:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
                
            case ENTER:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
                
            case FIGHT:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
                
             case READ:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
              
            case SEARCH:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
            case GRAB:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
            case HEAD:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
           case CHOOSE:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
                
            case PICK:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
                
            case KILL:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
            case SIDE:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;
           case ADVANCE:
            System.out.println();
            System.out.println();
                goRoom(command);
                break;

            case QUIT:
                wantToQuit = quit(command);
                break;
                
           
        }
        return wantToQuit;
    }
    private void look() // look what room your are in
    
     {
        System.out.println(currentRoom.getLongDescription());
        System.out.println("Your command words are:");
        parser.showCommands();
    }
   
    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() // type to so user has help
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) //the amount of words the user can type
    {
       
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

       String direction = command.getSecondWord();
     
        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("Please try something else!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command)  // allow user to quit
    {
        if(command.hasSecondWord() & command.hasThirdWord()) {
            System.out.println("what?!?!?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
       
    }
}



