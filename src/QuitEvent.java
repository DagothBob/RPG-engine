/**
 * Example of an event which runs after the user quits the game.
 * Called using the preset "!quit_event" command.
 */
public class QuitEvent extends AbstractEvent{
    public QuitEvent() {
        super(new String[]{
                "!quit_event"
        });
    }

    @Override
    protected void execute(GameState game_state_) {
        System.out.println("Goodbye!");
    }
}
