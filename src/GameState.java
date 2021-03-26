import java.util.Hashtable;

/**
 * Class for holding game-state values (all the non-code data of the game).
 *
 * This is how events can pass information to each other.
 */
public class GameState {
    private final Hashtable<String, Object> values;

    /**
     * Only one GameState is constructed for the game.
     */
    public GameState() {
        values = new Hashtable<>();
    }

    /**
     * Get the value of a game-state variable.
     *
     * @param name_ Identifier key of the game-state variable
     * @return Value of the game-state variable
     */
    public Object getValue(String name_) {
        return values.get(name_);
    }

    /**
     * Set or replace a game-state variable key/value pair.
     *
     * @param name_ Identifier key of the game-state variable
     * @param val_ Value for the game-state variable
     */
    public void setValue(String name_, Object val_) {
        if (values.containsKey(name_))
            values.replace(name_, val_);
        else
            values.put(name_, val_);
    }
}
