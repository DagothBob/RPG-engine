/**
 * MyEvent extends AbstractEvent.
 * MyEvent gets a list of commands to respond to, and runs the code in
 *  execute() when the current command matches one in its list.
 */
public abstract class AbstractEvent {
    private final String[] command_list; // Commands which trigger this event

    /**
     * Events need a list of one or more commands to trigger them. Pass
     * in the list of commands which you want to trigger your event.
     *
     * @param command_list_ List of commands which trigger the event to execute
     */
    public AbstractEvent(String[] command_list_) {
        command_list = command_list_;
    }

    /**
     * Event checks its list of commands to tell the game engine whether
     * or not it should be executed for the given command.
     *
     * @param command_ Command to check for
     * @return Whether the event should execute or not
     */
    public boolean hasCommand(String command_) {
        for (String str : command_list) {
            if (str.equalsIgnoreCase(command_)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Override and add code to execute when the event's
     * command is inputted by the user.
     *
     * @param game_state_ The current game state for accessing and sharing
     *                    data with other events.
     */
    protected abstract void execute(GameState game_state_);
}
