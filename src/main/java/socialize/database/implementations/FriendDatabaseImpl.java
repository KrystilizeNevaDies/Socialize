package socialize.database.implementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import socialize.data.FriendData;
import socialize.database.FriendDatabase;

public class FriendDatabaseImpl extends SetDatabaseImpl<FriendData> implements FriendDatabase {

	public FriendDatabaseImpl(Set<FriendData> set) {
		super(set);
	}

	@Override
	public FriendData getFriend(UUID uuid) {
		return get(data -> data.getFriend().equals(uuid));
	}

	@Override
	public Map<UUID, FriendData> getFriends() {

		final Map<UUID, FriendData> map = new HashMap<>();

		getAll().stream().filter(FriendData::isFriend).forEach(data -> map.put(data.getFriend(), data));

		return map;
	}
}
