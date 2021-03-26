/**
 * Example of how to set up an event.
 */
public class TestEvent extends AbstractEvent{
    public TestEvent() {
        super(new String[]{ // Pass in the commands to trigger this event
                "Test Command",
                "TesterCommand"
        });
    }

    @Override
    protected void execute(GameState game_state_) {
        game_state_.setValue("TestInt", 69);
        game_state_.setValue("TestDouble", 420.0);
        game_state_.setValue("TestString", "Woww");
        System.out.println(game_state_.getValue("TestInt"));
        System.out.println(game_state_.getValue("TestDouble"));
        System.out.println(game_state_.getValue("TestString"));
        System.out.println("Test did it!");
        System.out.flush();
    }
}
