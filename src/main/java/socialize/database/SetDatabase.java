package socialize.database;

import java.util.Set;

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
public interface SetDatabase<T> extends IDatabase<T> {
	/**
	 * Gets the set that is represented by this database
	 * 
	 * @return set
	 */
	public Set<T> getSet();
}
