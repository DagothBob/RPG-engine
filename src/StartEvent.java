/**
 * Example of an event which runs on game start-up using
 * the preset "!start_event" command.
 */
public class StartEvent extends AbstractEvent{
    public StartEvent() {
        super(new String[]{
                "!start_event"
        });
    }

    @Override
    protected void execute(GameState game_state_) {
        System.out.println("Welcome to the game!");
        System.out.println("Type something!");
    }
}
