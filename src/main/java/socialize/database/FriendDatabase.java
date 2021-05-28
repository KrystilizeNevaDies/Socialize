package socialize.database;

import java.util.Map;
import java.util.UUID;

import socialize.data.FriendData;

/**
 * This database type is used to easily access friend objects
 *
 * @author Krystilize
 *
 * @param
 */
public interface FriendDatabase extends IDatabase<FriendData> {
	/**
	 * Gets the most recent friends object represented by this uuid, null if none
	 */
	public FriendData getFriend(UUID uuid);

	/**
	 * Gets a full map of all of your current friends.
	 */
	public Map<UUID, FriendData> getFriends();
}
