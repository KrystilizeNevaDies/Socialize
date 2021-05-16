package socialize.data;

import java.util.UUID;

import socialize.tracing.OriginReference;

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
	public static  FriendData from(UUID friend, boolean isFriend, OriginReference origin) {
		return new FriendDataImpl(friend, isFriend, origin);
	}
	
	class FriendDataImpl implements FriendData {
		UUID friend;
		boolean isFriend;
		OriginReference origin;
		
		FriendDataImpl(UUID friend, boolean isFriend, OriginReference origin) {
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
		
		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
