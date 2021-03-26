import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple engine for building a text-based adventure RPG.
 */
public class GameEngine {
    public static void main(String[] args) {
        GameEngine game = new GameEngine();
        Scanner input_scanner = new Scanner(System.in);
        game.RunEvent("!start_event"); // Entry-point for executing a game-start event

        while (true) {
            System.out.print(": ");
            String input = input_scanner.nextLine();

            if (input.equalsIgnoreCase("quit"))
                break;
            else if (!game.RunEvent(input)) {
                game.RunEvent("!error_event");
            }
        }

        game.RunEvent("!quit_event"); // Goodbye message, save the game, etc.
    }

    private final ArrayList<AbstractEvent> all_events;
    private final GameState game_state;

    private GameEngine() {
        game_state = new GameState();
        all_events = new ArrayList<>(Arrays.asList(
                /////////////////////////
                // Your events go here //
                /////////////////////////
                new StartEvent(),
                new QuitEvent(),
                new ErrorEvent(),
                new TestEvent()
        ));
    }

    private boolean RunEvent(String command_) {
        boolean command_handled = false;

        for (AbstractEvent event : all_events) {
            if (event.hasCommand(command_)) {
                event.execute(game_state);
                command_handled = true;
            }
        }

        return command_handled;
    }
}
