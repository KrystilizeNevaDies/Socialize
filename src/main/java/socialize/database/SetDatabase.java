package socialize.database;

import java.util.Set;

import socialize.data.OriginData;

/**
 * This database type is used to represent a connection between an external database and the server.
 * <br><br>
 * This database type assumes that all objects are unordered and do not have a key
 * 
 * 
 * @author Krystilize
 *
 * @param <T>
 */
public interface SetDatabase<T extends OriginData> extends IDatabase<T> {
	/**
	 * Gets the set that is represented by this database
	 * 
	 * @return set
	 */
	public Set<T> getSet();
}
