package socialize.database;

import java.util.Set;
import java.util.function.Predicate;

/**
 * This is a class used to represent a connection between an external database and the server.
 * <br><br>
 * This class assumes that all objects are part of a set
 * 
 * 
 * @author Krystilize
 *
 * @param <T>
 */
public interface SetDatabase<T> {
	/**
	 * Gets all values from the database, see {@link SetDatabase}'s comments for more info
	 * @param uuid
	 * @param consumer
	 */
	public Set<T> getAll();

	/**
	 * Gets the first value from the database that fits the specific condition, see {@link SetDatabase}'s comments for more info
	 * @param uuid
	 * @param condition
	 * @param consumer
	 */
	public T get(Predicate<T> condition);
}
