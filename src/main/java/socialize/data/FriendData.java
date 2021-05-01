package socialize.data;

import java.util.UUID;

import socialize.tracing.Origin;

public interface FriendData {
	
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
	 * Gets the origin of this friend
	 * 
	 * @return Origin
	 */
	public Origin getOrigin();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static FriendData from(UUID friend, Origin origin, boolean isFriend) {
		return new FriendDataImpl(friend, origin, isFriend);
	}
	
	class FriendDataImpl implements FriendData {
		UUID friend;
		Origin origin;
		boolean isFriend;
		
		FriendDataImpl(UUID friend, Origin origin, boolean isFriend) {
			this.friend = friend;
			this.origin = origin;
			this.isFriend = isFriend;
		}
		
		@Override
		public UUID getUUID() {
			return friend;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}

		@Override
		public boolean isFriend() {
			// TODO Auto-generated method stub
			return false;
		}
	}
}
