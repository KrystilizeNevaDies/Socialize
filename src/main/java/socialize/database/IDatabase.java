package socialize.database;

import java.util.Set;
import java.util.function.Predicate;
/**
 * A database used to retrieve and store data relating to player socials
 * 
 * @author Krystilize
 */
public interface IDatabase<T> {
	/**
	 * Gets all values from the database, see {@link SetDatabase}'s comments for more info
	 * @param uuid
	 * @param consumer
	 */
	public Set<T> getAll();

	/**
	 * Gets the first value from the database that fits the specific condition
	 * @param uuid
	 * @param condition
	 * @param consumer
	 */
	public T get(Predicate<T> condition);
	
	/**
	 * Adds the specified data to the database
	 * @param data
	 * @return
	 */
	public void add(T data);
}
