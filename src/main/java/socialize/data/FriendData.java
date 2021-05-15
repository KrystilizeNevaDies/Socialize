package socialize.data;

import java.util.UUID;

public interface FriendData extends OriginData {
	
	/**
	 * Gets the UUID of this friend
	 * 
	 * @return ID
	 */
	public UUID getUUID();
	
	/**
	 * Gets whether this data denotes a new friendship or a friendship termination.
	 * 
	 * @return bool
	 */
	public boolean isFriend();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static FriendData from(UUID friend, long origin, boolean isFriend) {
		return new FriendDataImpl(friend, origin, isFriend);
	}
	
	class FriendDataImpl implements FriendData {
		UUID friend;
		long origin;
		boolean isFriend;
		
		FriendDataImpl(UUID friend, long origin, boolean isFriend) {
			this.friend = friend;
			this.origin = origin;
			this.isFriend = isFriend;
		}
		
		@Override
		public UUID getUUID() {
			return friend;
		}

		@Override
		public long getOrigin() {
			return origin;
		}

		@Override
		public boolean isFriend() {
			return isFriend;
		}
	}
}
