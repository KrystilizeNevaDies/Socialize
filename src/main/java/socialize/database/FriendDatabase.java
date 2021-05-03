package socialize.database;

import java.util.UUID;

import javax.annotation.Nullable;

import socialize.data.FriendData;

/**
 * This database type is used to easily access friend objects
 * @author Krystilize
 *
 * @param <T>
 */
public interface FriendDatabase extends SetDatabase<FriendData> {
	/**
	 * Gets the most recent friends object represented by this uuid, null if none
	 * 
	 * @return set
	 */
	public @Nullable FriendData getFriend(UUID uuid);
}
