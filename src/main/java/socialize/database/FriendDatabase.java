package socialize.database;

import java.util.UUID;

import socialize.data.FriendData;

/**
 * This database type is used to easily access friend objects
 * @author Krystilize
 *
 * @param 
 */
public interface FriendDatabase extends IDatabase<FriendData> {
	/**
	 * Gets the most recent friends object represented by this uuid, null if none
	 * 
	 * @return set
	 */
	public FriendData getFriend(UUID uuid);
}
