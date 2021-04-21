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
	public static FriendData from(UUID friend, Origin origin) {
		return new FriendDataImpl(friend, origin);
	}
	
	class FriendDataImpl implements FriendData {
		UUID friend;
		
		Origin origin;
		
		FriendDataImpl(UUID friend, Origin origin) {
			this.friend = friend;
			this.origin = origin;
		}
		
		@Override
		public UUID getUUID() {
			return friend;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
