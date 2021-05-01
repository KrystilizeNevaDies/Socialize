package socialize.database;

import java.util.Map;

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
public interface MapDatabase<K, V> extends IDatabase<Map.Entry<K, V>> {
	/**
	 * Gets the map that is represented by this database
	 * 
	 * @return map
	 */
	public Map<K, V> getMap();
}
