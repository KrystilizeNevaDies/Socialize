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
	public static <T> FriendData from(UUID friend, boolean isFriend, T origin) {
		return new FriendDataImpl<T>(friend, isFriend, origin);
	}
	
	class FriendDataImpl<T> implements FriendData {
		UUID friend;
		boolean isFriend;
		T origin;
		
		FriendDataImpl(UUID friend, boolean isFriend, T origin) {
			this.friend = friend;
			this.origin = origin;
			this.isFriend = isFriend;
		}
		
		@Override
		public UUID getUUID() {
			return friend;
		}

		@Override
		public boolean isFriend() {
			return isFriend;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
