/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  Robert Foder
 * @version 3/23/15
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), READ("read"),FIGHT("fight"), RUN("run"), SEARCH("search"), TO("to"),
    ENTER("enter"), GRAB("grab"), HEAD("head"), CHOOSE("choose"), LOOK("look"),PICK("pick"),KILL("kill"),SIDE("side"),
    ADVANCE("advance"),;
    
    // The command string.
    private String commandString;
    
    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
}
