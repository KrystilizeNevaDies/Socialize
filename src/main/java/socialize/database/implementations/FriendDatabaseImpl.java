package socialize.database.implementations;

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
		return this.get(data -> data.getUUID().equals(uuid));
	}
}
