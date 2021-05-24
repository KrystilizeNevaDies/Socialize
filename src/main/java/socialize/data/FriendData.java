package socialize.data;

import java.util.UUID;

public interface FriendData extends OriginData {
	
	/**
	 * Gets the UUID of this friend
	 * 
	 * @return ID
	 */
	public UUID getFriend();
	
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
	public static  FriendData from(UUID friend, boolean isFriend, UUID origin) {
		return new FriendDataImpl(friend, isFriend, origin);
	}
	
	class FriendDataImpl implements FriendData {
		UUID friend;
		boolean isFriend;
		UUID origin;
		
		FriendDataImpl(UUID friend, boolean isFriend, UUID origin) {
			this.friend = friend;
			this.origin = origin;
			this.isFriend = isFriend;
		}
		
		@Override
		public UUID getFriend() {
			return friend;
		}

		@Override
		public boolean isFriend() {
			return isFriend;
		}
		
		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
