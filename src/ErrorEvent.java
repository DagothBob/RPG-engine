/**
 * Example of an event which runs when the user inputs an unknown command.
 * Called using the preset "!error_event" command.
 */
public class ErrorEvent extends AbstractEvent{
    public ErrorEvent() {
        super(new String[]{
                "!error_event"
        });
    }

    @Override
    protected void execute(GameState game_state_) {
        System.out.println("What? I didn't understand that command. Try something else (case insensitive).");
    }
}
